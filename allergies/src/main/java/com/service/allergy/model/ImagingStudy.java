package com.service.allergy.model;

import java.util.Date;

public class ImagingStudy {
	
	private final transient String patientId;
	private final transient String encounterId;

	private String id;
	private Date date;
	private String bodySiteCode;
	private String bodySiteDesc;
	private String modalityCode;
	private String modalityCodeDesc;
	private String sopCode;
	private String sopDesc;

	public ImagingStudy(final String patientId, final String encounterId) {
		this.patientId = patientId;
		this.encounterId = encounterId;
	}

	public ImagingStudy(final String patientId, final String encounterId,String id) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.id = id;
	}

	public ImagingStudy(final String patientId, final String encounterId, String id, Date date, String bodySiteCode,
			String bodySiteDesc, String modalityCode, String modalityCodeDesc, String sopCode, String sopDesc) {
		this.patientId = patientId;
		this.encounterId = encounterId;
		this.id = id;
		this.date = date;
		this.bodySiteCode = bodySiteCode;
		this.bodySiteDesc = bodySiteDesc;
		this.modalityCode = modalityCode;
		this.modalityCodeDesc = modalityCodeDesc;
		this.sopCode = sopCode;
		this.sopDesc = sopDesc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBodySiteCode() {
		return bodySiteCode;
	}

	public void setBodySiteCode(String bodySiteCode) {
		this.bodySiteCode = bodySiteCode;
	}

	public String getBodySiteDesc() {
		return bodySiteDesc;
	}

	public void setBodySiteDesc(String bodySiteDesc) {
		this.bodySiteDesc = bodySiteDesc;
	}

	public String getModalityCode() {
		return modalityCode;
	}

	public void setModalityCode(String modalityCode) {
		this.modalityCode = modalityCode;
	}

	public String getModalityCodeDesc() {
		return modalityCodeDesc;
	}

	public void setModalityCodeDesc(String modalityCodeDesc) {
		this.modalityCodeDesc = modalityCodeDesc;
	}

	public String getSopCode() {
		return sopCode;
	}

	public void setSopCode(String sopCode) {
		this.sopCode = sopCode;
	}

	public String getSopDesc() {
		return sopDesc;
	}

	public void setSopDesc(String sopDesc) {
		this.sopDesc = sopDesc;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getEncounterId() {
		return encounterId;
	}
}
