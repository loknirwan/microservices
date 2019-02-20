package com.service.encounter.model;

import java.util.Date;
import java.util.List;

public class Patient {

	private String id;
	private Date birthDate;
	private Date deathDate;
	private String ssn;
	private String driverLicence;
	private String passport;
	private String prefix;
	private String firstName;
	private String lastName;
	private String suffix;
	private String maidenName;
	private String maritalStatus;
	private String race;
	private String ethnicity;
	private String gender;
	private String birthPlace;
	private String address;
	private String city;
	private String state;
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
