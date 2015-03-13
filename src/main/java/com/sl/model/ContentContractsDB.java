package com.sl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sl.hibernate.BaseEntity;


@DynamicUpdate
@Entity
@Table(name="contentcontracts")
public class ContentContractsDB extends BaseEntity{
	
	private static final long serialVersionUID = -4129438362094022442L;
	
	@Column
	private String contractor;
	@Column
	private String currency;
	@Column
	private String fixPaymentSumm;
	@Column
	private String isContractBlockRules;
	@Column
	private String isLicenseExclusive;
	@Column
	private String minGarantySumm;
	@Column
	private String royalty;
	@Column
	private String vatSumm;
	@Column
	private String contentContract;
	@Column
	private String endDate;
	@Column
	private String startDate;
	public String getContractor() {
		return contractor;
	}
	public ContentContractsDB setContractor(String contractor) {
		this.contractor = contractor;
		return this;
	}
	public String getCurrency() {
		return currency;
	}
	public ContentContractsDB setCurrency(String currency) {
		this.currency = currency;
		return this;
	}
	public String getFixPaymentSumm() {
		return fixPaymentSumm;
	}
	public ContentContractsDB setFixPaymentSumm(String fixPaymentSumm) {
		this.fixPaymentSumm = fixPaymentSumm;
		return this;
	}
	public String getIsContractBlockRules() {
		return isContractBlockRules;
	}
	public ContentContractsDB setIsContractBlockRules(String isContractBlockRules) {
		this.isContractBlockRules = isContractBlockRules;
		return this;
	}
	public String getIsLicenseExclusive() {
		return isLicenseExclusive;
	}
	public ContentContractsDB setIsLicenseExclusive(String isLicenseExclusive) {
		this.isLicenseExclusive = isLicenseExclusive;
		return this;
	}
	public String getMinGarantySumm() {
		return minGarantySumm;
	}
	public ContentContractsDB setMinGarantySumm(String minGarantySumm) {
		this.minGarantySumm = minGarantySumm;
		return this;
	}
	public String getRoyalty() {
		return royalty;
	}
	public ContentContractsDB setRoyalty(String royalty) {
		this.royalty = royalty;
		return this;
	}
	public String getVatSumm() {
		return vatSumm;
	}
	public ContentContractsDB setVatSumm(String vatSumm) {
		this.vatSumm = vatSumm;
		return this;
	}
	public String getContentContract() {
		return contentContract;
	}
	public ContentContractsDB setContentContract(String contentContract) {
		this.contentContract = contentContract;
		return this;
	}
	public String getEndDate() {
		return endDate;
	}
	public ContentContractsDB setEndDate(String endDate) {
		this.endDate = endDate;
		return this;
	}
	public String getStartDate() {
		return startDate;
	}
	public ContentContractsDB setStartDate(String startDate) {
		this.startDate = startDate;
		return this;
	}
	
	 @Override
	    public String toString() {
	        return "[contractor : " + getContractor() + ";\n" +
	        		"currency : " + getCurrency() + ";\n" +
	        		"fixPaymentSumm : " + getFixPaymentSumm() + ";\n" +
	        		"isContractBlockRules : " + getIsContractBlockRules() + ";\n" +
	        		"isLicenseExclusive : " + getIsLicenseExclusive() + ";\n" +
	        		"minGarantySumm : " + getMinGarantySumm() + ";\n" +
	        		"royalty : " + getRoyalty() + ";\n" +
	        		"vatSumm : " + getVatSumm() + ";\n]";
//	        		"endDate : " + getEndDate() + ";\n" +
//	        		"startDate : " + getStartDate() + ";\n]";
	    }

}
