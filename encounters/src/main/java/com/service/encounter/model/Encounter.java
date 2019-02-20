package com.service.encounter.model;

import java.util.Date;
import java.util.List;

public class Encounter {
	
	private transient final String patientId;

	private String id;
	private Date startDate;
	private Date endDate;
	
	private Patient patient;
	
	private String encounterClass;
	private String code;
	private String description;
	private String cost;
	private String reasonCode;
	private String reasonDescription;
	
	private List<Allergy> allergies;
	private List<Condition> conditions;
	private List<Medication> medications;
	private List<Procedure> procedures;
	private List<Observation> observations;
	private List<ImagingStudy> imagingStudies;
	private List<Immunization> immunizations;
	private List<Careplan> careplans;
	

	public Encounter(final String patientId) {
		this.patientId = patientId;
	}

	public Encounter(String id, final String patientId) {
		this.patientId = patientId;
		this.id = id;
	}
	
	public Encounter(final String patientId, String id, Date startDate, Date endDate, String encounterClass, String code,
			String description, String cost, String reasonCode, String reasonDescription,
			List<Allergy> allergies, List<Condition> conditions, List<Medication> medications, List<Procedure> procedures,
			List<Observation> observations, List<ImagingStudy> imagingStudies, List<Immunization> immunizations, List<Careplan> careplans) {
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
		this.allergies = allergies;
		this.medications = medications;
		this.observations = observations;
		this.imagingStudies = imagingStudies;
		this.procedures = procedures;
		this.conditions = conditions;
		this.immunizations = immunizations;
		this.careplans = careplans;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public List<Medication> getMedications() {
		return medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}

	public List<Procedure> getProcedures() {
		return procedures;
	}

	public void setProcedures(List<Procedure> procedures) {
		this.procedures = procedures;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public List<ImagingStudy> getImagingStudies() {
		return imagingStudies;
	}

	public void setImagingStudies(List<ImagingStudy> imagingStudies) {
		this.imagingStudies = imagingStudies;
	}

	public List<Immunization> getImmunizations() {
		return immunizations;
	}

	public void setImmunizations(List<Immunization> immunizations) {
		this.immunizations = immunizations;
	}

	public List<Careplan> getCareplans() {
		return careplans;
	}

	public void setCareplans(List<Careplan> careplans) {
		this.careplans = careplans;
	}
}
