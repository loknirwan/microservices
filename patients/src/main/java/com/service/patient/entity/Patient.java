package com.service.patient.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="patients", schema="synthea")
public class Patient implements java.io.Serializable {

	private static final long serialVersionUID = -5127694130109215263L;
	
	@Id
	@Column(name="ID", length=256, nullable=false, updatable=false)
	private String id;
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Temporal(TemporalType.DATE)
	@Column(name="DEATH_DATE")
	private Date deathDate;
	@Column(name="SSN", length=16)
	private String ssn;
	@Column(name="DRIVER_LICENCE", length=16)
	private String driverLicence;
	@Column(name="PASSPORT", length=16)
	private String passport;
	@Column(name="PREFIX", length=8)
	private String prefix;
	@Column(name="FIRST_NAME", length=32)
	private String firstName;
	@Column(name="LAST_NAME", length=32)
	private String lastName;
	@Column(name="SUFFIX", length=8)
	private String suffix;
	@Column(name="MAIDEN_NAME", length=32)
	private String maidenName;
	@Column(name="MARITAL_STATUS", length=2)
	private String maritalStatus;
	@Column(name="RACE", length=32)
	private String race;
	@Column(name="ETHNICITY", length=32)
	private String ethnicity;
	@Column(name="GENDER", length=2)
	private String gender;
	@Column(name="BIRTH_PLACE", length=16)
	private String birthPlace;
	@Column(name="ADDRESS", length=48)
	private String address;
	@Column(name="CITY", length=16)
	private String city;
	@Column(name="STATE", length=32)
	private String state;
	@Column(name="ZIP", length=16)
	private String zip;

	public Patient() {
	}

	public Patient(String id) {
		this.id = id;
	}

	public Patient(String id, Date birthDate, Date deathDate, String ssn, String driverLicence, String passport,
			String prefix, String firstName, String lastName, String suffix, String maidenName, String maritalStatus,
			String race, String ethnicity, String gender, String birthPlace, String address, String city, String state,
			String zip) {
		this.id = id;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.ssn = ssn;
		this.driverLicence = driverLicence;
		this.passport = passport;
		this.prefix = prefix;
		this.firstName = firstName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.maidenName = maidenName;
		this.maritalStatus = maritalStatus;
		this.race = race;
		this.ethnicity = ethnicity;
		this.gender = gender;
		this.birthPlace = birthPlace;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getDeathDate() {
		return this.deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDriverLicence() {
		return this.driverLicence;
	}

	public void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
