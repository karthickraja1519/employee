package com.employeejpa.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Employee {
	
	private String comp_name;
	private String emp_name;
	private String prev_qual;
	
	@Id
	private int emp_id;

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getPrev_qual() {
		return prev_qual;
	}

	public void setPrev_qual(String prev_qual) {
		this.prev_qual = prev_qual;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
	
	
}
