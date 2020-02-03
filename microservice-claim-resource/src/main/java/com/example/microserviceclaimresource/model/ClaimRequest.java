package com.example.microserviceclaimresource.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class ClaimRequest {
private String claimType;


	

	private String planType;
    

	private String claimReceivedDate;
	
	
	private int billType;

	@Size(max = 15,message = "ISA Sender ID length must be less than or 15")
	private String isaSenderId;
	
	//@Pattern(regexp = "837I|837P", message = "Transaction type should be either 837I or 837P")
	

	private String transactionType;


	private int serviceCode;
	

	public String getClaimType() {
		return claimType;
	}

	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getClaimReceivedDate() {
		return claimReceivedDate;
	}

	public void setClaimReceivedDate(String claimReceivedDate) {
		this.claimReceivedDate = claimReceivedDate;
	}

	public String getIsaSenderId() {
		return isaSenderId;
	}

	public void setIsaSenderId(String isaSenderId) {
		this.isaSenderId = isaSenderId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(int serviceCode) {
		this.serviceCode = serviceCode;
	}

	@Override
	public String toString() {
		return "ClaimNumberRequest [claimType=" + claimType + ", planType=" + planType + ", claimReceivedDate="
				+ claimReceivedDate + ", billType=" + billType + ", isaSenderId=" + isaSenderId + ", transactionType="
				+ transactionType + ", serviceCode=" + serviceCode + "]";
	}
}
	
	