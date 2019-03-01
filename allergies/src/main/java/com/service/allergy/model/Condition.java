package com.service.allergy.model;

import java.util.Date;

public class Condition {
	
	private final transient String patientId;
	private final transient String encounterId;
	

	private Date startDate;
	private Date endDate;
	private String code;
	private String description;

	public Condition(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}
	
	public Condition(Date startDate, Date endDate, final String patientId, final String encounterId, String code,
			String description) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.code = code;
		this.description = description;
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

	public String getPatientId() {
		return patientId;
	}

	public String getEncounterId() {
		return encounterId;
	}
	
}
