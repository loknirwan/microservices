package com.service.careplan.entity;
// Generated Feb 12, 2019 4:16:17 PM by Hibernate Tools 5.3.6.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Careplans generated by hbm2java
 */
@Entity
@Table(name="careplans", schema="synthea")
public class Careplan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5115717318209184972L;
	
	@Id
	@Column(name="ID", length=256, nullable=false)
	private String id;
	@Column(name="ENCOUNTER_ID", length=256, nullable=false)
	private String encounterId;
	@Column(name="PATIENT_ID", length=256, nullable=false)
	private String patientId;
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;
	@Column(name="CODE", length=16)
	private String code;
	@Column(name="DESCRIPTION", length=256)
	private String description;
	@Column(name="REASON_CODE", length=16)
	private String reasonCode;
	@Column(name="REASON_DESCRIPTION")
	private String reasonDescription;
	
	public Careplan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Careplan(String id, String encounterId, String patientId) {
		super();
		this.id = id;
		this.encounterId = encounterId;
		this.patientId = patientId;
	}

	public Careplan(String id, String encounterId, String patientId, Date startDate, Date endDate, String code,
			String description, String reasonCode, String reasonDescription) {
		super();
		this.id = id;
		this.encounterId = encounterId;
		this.patientId = patientId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.code = code;
		this.description = description;
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEncounterId() {
		return encounterId;
	}

	public void setEncounterId(String encounterId) {
		this.encounterId = encounterId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

}