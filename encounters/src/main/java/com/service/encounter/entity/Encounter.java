package com.service.encounter.entity;
// Generated Feb 12, 2019 3:49:10 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Encounters generated by hbm2java
 */

@Entity
@Table(name="encounters", schema="synthea")
public class Encounter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6109653801341403727L;
	@Id
	@Column(name="ID", length=256, nullable=false, updatable=false)
	private String id;
	@Column(name="PATIENT_ID", length=256, nullable=false, updatable=false)
	private String patientId;
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;
	@Column(name="ENCOUNTER_CLASS", length=32)
	private String encounterClass;
	@Column(name="CODE", length=16)
	private String code;
	@Column(name="DESCRIPTION", length=256)
	private String description;
	@Column(name="COST", length=16)
	private String cost;
	@Column(name="REASON_CODE", length=16)
	private String reasonCode;
	@Column(name="REASON_DESCRIPTION", length=256)
	private String reasonDescription;
	/*private Set allergieses = new HashSet(0);
	private Set conditionses = new HashSet(0);
	private Set medicationses = new HashSet(0);
	private Set procedureses = new HashSet(0);
	private Set observationses = new HashSet(0);
	private Set imagingStudieses = new HashSet(0);
	private Set immunizationses = new HashSet(0);
	private Set careplanses = new HashSet(0);*/

	public Encounter() {
	}

	public Encounter(String id, String patientId) {
		this.id = id;
		this.patientId = patientId;
	}

	public Encounter(String id, String patientId, Date startDate, Date endDate, String encounterClass, String code,
			String description, String cost, String reasonCode, String reasonDescription) {
		this.id = id;
		this.patientId = patientId;
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

	public String getEncounterClass() {
		return encounterClass;
	}

	public void setEncounterClass(String encounterClass) {
		this.encounterClass = encounterClass;
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
}
