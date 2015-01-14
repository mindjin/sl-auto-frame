package com.sl.data;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RandomValues {
	
	
	static Date date = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
	static Random random = new Random();
	public String a;
	
	
	public static <T> List<Element> getValues(T t) throws ParseException, SQLException{
		
		
		
		String nameClass = t.getClass().getSimpleName();
		List<Element> field = Factory.getInstance().getElementDAO().getAllField(nameClass);
		
		
		for(Element element:field){
//			System.out.println(element.getName()+" "+element.getType()+" "+element.getValue());
			
			switch(element.getType()){
			case "date": 
					if(element.getName().equals("Окончание")){
						
				String rndDate = generateDate();
//				System.out.println(rndDate);
//				System.out.println(element.getID());				
				Factory.getInstance().getElementDAO().updateField(element.getID(),rndDate);}
				
					if(element.getName().equals("Начало"))
					Factory.getInstance().getElementDAO().updateField(element.getID(), sdf.format(date));
					
				break;
			case "textfield":
				String getRandomText = generateText();
				Factory.getInstance().getElementDAO().updateField(element.getID(),"UI_Test_"+nameClass+"_"+getRandomText);
				break;
			case "integer":
				String  getRandomNumber = String.valueOf(generateNumber());				
				Factory.getInstance().getElementDAO().updateField(element.getID(),getRandomNumber);
				break;
				
			case "double":
				
				String getRandomDouble = String.valueOf(generateDouble());
				Factory.getInstance().getElementDAO().updateField(element.getID(),getRandomDouble);
				
			break;
			
			default:
				break;
			}
			
				
			
			
		}
		
		field = Factory.getInstance().getElementDAO().getAllField(nameClass);
		return field;
		
	}


	private static String generateDate() throws ParseException {
		Date dateFrom2 = sdf.parse(sdf.format(date));
		Date dateFrom = sdf.parse("30.12.2015 24:24:24");
		long firstDate = dateFrom.getTime();		
		long endDate = dateFrom2.getTime();
		long getAllTime = firstDate - endDate;
		String rndDate = sdf.format(firstDate+random.nextGaussian()*getAllTime);
		return rndDate;
	}
	
	
	private static String generateText(){
	
		
		String getText = "0123456789asdfghjklqwertyuiopzxcvbnm";
		String  rndText = "";
		
	
		for(int i=0;i<10;i++){
			
			int getRandomLength = random.nextInt(getText.length());
			char getLetter = getText.charAt(getRandomLength);
			
			rndText = rndText+getLetter;
		
		
		
	}
		return rndText;
	}
	
	private static Integer generateNumber(){
		int rndNumber = random.nextInt(9999);
		return rndNumber;
		
		
	}
	
	private static Double generateDouble(){
		int rndInt = random.nextInt(9999);
		double rndDouble = Double.valueOf(rndInt);
		return rndDouble;
	}

}
