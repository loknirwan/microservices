package com.service.allergy.model;

import java.util.Date;

public class Encounter {
	
	private transient final String patientId;

	private String id;
	private Date startDate;
	private Date endDate;
	private String encounterClass;
	private String code;
	private String description;
	private String cost;
	private String reasonCode;
	private String reasonDescription;
	

	public Encounter(final String patientId) {
		this.patientId = patientId;
	}

	public Encounter(String id, final String patientId) {
		this.patientId = patientId;
		this.id = id;
	}

	public Encounter(final String patientId, String id, Date startDate, Date endDate, String encounterClass, String code,
			String description, String cost, String reasonCode, String reasonDescription) {
		this.patientId = patientId;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.encounterClass = encounterClass;
		this.code = code;
		this.description = description;
		this.cost = cost;
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEncounterClass() {
		return this.encounterClass;
	}

	public void setEncounterClass(String encounterClass) {
		this.encounterClass = encounterClass;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDescription() {
		return this.reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	public String getPatientId() {
		return patientId;
	}
}
