package com.sl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Repeatable(Entities.class)
public @interface Entity {
	
	    Class entity();	  
	    int invocationCount() default 0;
	    long[] ids() default {};
	

}
