package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="contentinpurchasem")
public class ContentInPurchaseMDB  extends BaseEntity{
	
	
	private static final long serialVersionUID = -2726808119764551865L;

	@Column
	private String purchaseMethod;
	
	@Column
	private String sort;

	public String getPurchaseMethod() {
		return purchaseMethod;
	}

	public ContentInPurchaseMDB setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
		return this;
	}

	public String getSort() {
		return sort;
	}

	public ContentInPurchaseMDB setSort(String sort) {
		this.sort = sort;
		return this;
	}

	@Override
    public String toString() {
        return "[purchaseMethod : " + getPurchaseMethod() + ";\n" +
        		"sort : " + getSort() + ";\n]";
    }
}
