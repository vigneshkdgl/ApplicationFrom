package com.vignesh.student.Model;

public class FamilyDetails {

	private long memberId;
	private long studentId;
	private String parentType;
	private String name;
	private String occupation;
	private String annuvalIncome;

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getParentType() {
		return parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAnnuvalIncome() {
		return annuvalIncome;
	}

	public void setAnnuvalIncome(String annuvalIncome) {
		this.annuvalIncome = annuvalIncome;
	}

}
