package com.gestion_empleados.app.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee") 
public class Employee {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 

	@Column(name = "name", length = 50, nullable = false)
	private String name;

	@Column(name = "father_last_name", length = 50, nullable = false)
	private String fatherLastName;
	
	@Column(name = "mother_last_name", length = 50, nullable = false)
	private String MotherLastName;
	
	@Column(name = "company", length = 50, nullable = false)
	private String company;
	
	@Column(name = "gender", length = 16, nullable = false)
	private String gender;
	
	@Column(name = "birthdate", length = 100, nullable = false)
	private LocalDate birthdate; 
	
	@Column(name = "country", length = 150, nullable = false)
	private String country;
	
	@Column(name = "state", length = 150, nullable = false)
	private String state;
	
	@Column(name = "curp", length = 18, nullable = false)
	private String curp;
	
	@Column(name = "rfc", length = 13, nullable = false)
	private String rfc;

	Employee(){
		
	}
	
	public Employee(String name, String fatherLastName, String motherLastName, String company, String gender,
			LocalDate birthdate, String country, String state, String curp, String rfc) {
		this.name = name;
		this.fatherLastName = fatherLastName;
		this.MotherLastName = motherLastName;
		this.company = company;
		this.gender = gender;
		this.birthdate = birthdate;
		this.country = country;
		this.state = state;
		this.curp = curp;
		this.rfc = rfc;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fatherLastName
	 */
	public String getFatherLastName() {
		return fatherLastName;
	}

	/**
	 * @param fatherLastName the fatherLastName to set
	 */
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	/**
	 * @return the motherLastName
	 */
	public String getMotherLastName() {
		return MotherLastName;
	}

	/**
	 * @param motherLastName the motherLastName to set
	 */
	public void setMotherLastName(String motherLastName) {
		MotherLastName = motherLastName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthdate
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the countr
	 */
	public String getCountr() {
		return country;
	}

	/**
	 * @param countr the countr to set
	 */
	public void setCountr(String countr) {
		this.country = countr;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
}
