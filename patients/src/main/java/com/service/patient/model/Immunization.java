package com.service.patient.model;

import java.util.Date;

public class Immunization {

	private final transient String patientId;
	private final transient String encounterId;
	
	private Date date;
	private String code;
	private String codeDesc;
	private String cost;

	public Immunization(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}


	public Immunization(String patientId, String encounterId, Date date, String code, String codeDesc, String cost) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.date = date;
		this.code = code;
		this.codeDesc = codeDesc;
		this.cost = cost;
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

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getEncounterId() {
		return encounterId;
	}
}
