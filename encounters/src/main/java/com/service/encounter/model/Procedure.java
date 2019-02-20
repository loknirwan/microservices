package com.service.encounter.model;

import java.util.Date;

public class Procedure {

	private final transient String patientId;
	private final transient String encounterId;
	
	private Date date;
	private String code;
	private String description;
	private String cost;
	private String reasonCode;
	private String reasonDescription;
	
	public Procedure(String patientId, String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}

	public Procedure(String patientId, String encounterId, Date date, String code, String description, String cost,
			String reasonCode, String reasonDescription) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.date = date;
		this.code = code;
		this.description = description;
		this.cost = cost;
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
