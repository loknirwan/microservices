package com.service.careplan.model;

import java.util.Date;

public class Careplan  {
	
	private final transient String patientId;
	private final transient String encounterId;

	private String id;
	private Date startDate;
	private Date endDate;
	private String code;
	private String description;
	private String reasonCode;
	private String reasonDescription;
	
	private Patient patient;
	private Encounter encounter;

	public Careplan(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}

	public Careplan(final String patientId, final String encounterId, String id) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.id = id;
	}

	public Careplan(final String patientId, final String encounterId, String id, Date startDate, Date endDate, String code,
			String description, String reasonCode, String reasonDescription, Patient patient, Encounter encounter) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.code = code;
		this.description = description;
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
		this.patient = patient;
		this.encounter = encounter;
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

	public String getEncounterId() {
		return encounterId;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
}
