package com.sl.utils;



import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.testng.annotations.DataProvider;

import com.sl.annotation.Entity;
import com.sl.hibernate.BaseEntity;
import com.sl.hibernate.DAO;
import com.sl.hibernate.DataSet;
import com.sl.hibernate.GenericDAO;

public class DataProviderUtils {
	
	
	public static final String GENERIC_DP = "genericDP";
	
	@SuppressWarnings("unchecked")
	@DataProvider(name = GENERIC_DP)
	public static Iterator<Object[]> provideDBData(Method testMethod){
		
		if (testMethod == null)
			throw new IllegalArgumentException("Test method cannot be null!");
		
		
		final List<DataSet> dataSets = new ArrayList<>();
        final List<Object[]> outputData = new ArrayList<>();
		
        int outputDataSize = Integer.MAX_VALUE;

        for (Entity entity : testMethod.getAnnotationsByType(Entity.class)) {
            DAO entityDAO = new GenericDAO<>(entity.entity());
            final List<BaseEntity> retrievedFields = new ArrayList<>();

            int minInvocationCount = entity.ids().length;

            if (minInvocationCount > 0) {
                for (long id : entity.ids()) {
                    retrievedFields.add(entityDAO.findById(id));
                }
            } else {
                retrievedFields.addAll(entityDAO.findAll());
                minInvocationCount = retrievedFields.size();
            }

            dataSets.add(new DataSet(retrievedFields).updateFieldsWith(entityDAO));

            final int currentDataSize = outputDataSize;
            outputDataSize = Optional.of(IntStream.of(entity.invocationCount(), minInvocationCount)
                    .filter(value -> value > 0)
                    .min()
                    .getAsInt())
                    .filter(value -> value < currentDataSize)
                    .orElse(currentDataSize);
        }

        if (outputDataSize < Integer.MAX_VALUE) {
            for (int i = 0; i < outputDataSize; i++) {
                final Object[] dataSet = new Object[dataSets.size()];

                for (int j = 0; j < dataSets.size(); j++) {
                    dataSet[j] = dataSets.get(j).getFields().get(i);
                }

                outputData.add(dataSet);
            }
        }

        return outputData.iterator();
	}
		
}
