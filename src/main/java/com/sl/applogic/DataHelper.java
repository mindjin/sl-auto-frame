package com.sl.applogic;

import java.sql.SQLException;
import java.util.List;

import com.sl.data.Element;
import com.sl.data.Factory;
import com.sl.data.RandomValues;
import com.sl.pages.AnyForm;
import com.sl.pages.PageManager.Form;


public class DataHelper extends DriverBasedHelper{

	
	
	public DataHelper(ApplicationManager applicationManager) {
		super(applicationManager.getWebDriver());
		
	}
	
	public enum ElementsForm{
		NAME("row_name"),
		URL("row_url"),
		CONTENTCONTRACT("row_contentContract"),
		CONTENTINPURCHASEM("row_purchaseMethod");
		ElementsForm(String nameVariable){
			this.nameVariable = nameVariable;
		}
		private String nameVariable;
		
		public String getValue(){
			String value = Factory.getInstance().getElementDAO().getSearchItem(nameVariable);
			return value;
		}
	}
	
	
	
	public List<Element> getRandomValues(Form form){		
		AnyForm page = pageManager.getPage(form);
		List<Element> fields = null;		
		fields = RandomValues.getValues(page);		
		return fields;
	}


	public List<Element> getDefaultValues(Form form){
		AnyForm page = pageManager.getPage(form);
		String nameClass = page.getClass().getSimpleName();
		List<Element> fields = null;
		try {
			fields = Factory.getInstance().getElementDAO().getAllField(nameClass);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return fields;
	}
	
	

}
