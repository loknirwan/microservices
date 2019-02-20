package com.service.patient.model;

import java.util.Date;

public class Allergy  {
	
	private final transient String patientId;
	private final transient String encounterId;
	
	private Date startDate;
	private Date endDate;
	private String code;
	private String description;
	
	public Allergy(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}
	
	public Allergy(final String patientId, final String encounterId, final Date startDate, final Date endDate, String code, String desciption) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.code = code;
		this.description = desciption;
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
	public String getPatientId() {
		return patientId;
	}
	public String getEncounterId() {
		return encounterId;
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
}
