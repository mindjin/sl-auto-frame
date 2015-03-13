package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="rentalwindows")
public class RentalWindowsDB extends BaseEntity{
	
	
	private static final long serialVersionUID = -3761718530880610314L;
	
	@Column
	private String parentID;	
	@Column
	private String namePackage;
	@Column
	private String startDate;
	@Column
	private String endDate;
	
	public String getParentID() {
		return parentID;
	}
	public RentalWindowsDB setParentID(String parentID) {
		this.parentID = parentID;
		return this;
	}
	public String getNamePackage() {
		return namePackage;
	}
	public RentalWindowsDB setNamePackage(String namePackage) {
		this.namePackage = namePackage;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public RentalWindowsDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public RentalWindowsDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	
	@Override
	public String toString(){
		return "[parentId : " + getParentID() + ";\n]";       		
//        		"startDate : " + getStartDate() + ";\n" +
//        		"endDate : " + getEndDate() + ";\n]";
	}

}
