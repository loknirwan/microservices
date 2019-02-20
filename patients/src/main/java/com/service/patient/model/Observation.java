package com.service.patient.model;

import java.util.Date;

public class Observation {
	
	private final transient String patientId;
	private final transient String encounterId;

	private Date date;
	private String code;
	private String codeDesc;
	private String value;
	private String units;
	private String type;

	public Observation(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}

	public Observation(final String patientId, final String encounterId, Date date, String code, String codeDesc, String value,
			String units, String type) {
		this.date = date;
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.code = code;
		this.codeDesc = codeDesc;
		this.value = value;
		this.units = units;
		this.type = type;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getEncounterId() {
		return encounterId;
	}
}
