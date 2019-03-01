package com.service.allergy.model;

import java.util.Date;

public class Medication {
	
	
	private final transient String patientId;
	private final transient String encounterId;
	
	private Date startDate;
	private Date endDate;
	private String code;
	private String description;
	private String cost;
	private String reasonCode;
	private String reasonDescription;
	
	public Medication() {
		this.patientId = null;
		this.encounterId = null;
	}
	
	public Medication(Date startDate, Date endDate, final String patientId, final String encounterId, String code,
			String description, String cost, String reasonCode, String reasonDescription) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.code = code;
		this.description = description;
		this.cost = cost;
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getEncounterId() {
		return encounterId;
	}
}
