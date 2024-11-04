package com.api.pojoClass;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetVideosForHomePojo {
	
	//Using for the response validation
	private int id;
	private String subject;
	private String description;
	private Timestamp sessionDate;
	private String facultyName;
	private int programSemSubjectId;
	
	
	// using for paylod
	private String currentAcadYear;
	private String currentAcadMonth;
	private ArrayList<Integer> currentSemPSSId;
	
	
	
	
	
	
	public String getCurrentAcadYear() {
		return currentAcadYear;
	}
	public void setCurrentAcadYear(String currentAcadYear) {
		this.currentAcadYear = currentAcadYear;
	}
	public String getCurrentAcadMonth() {
		return currentAcadMonth;
	}
	public void setCurrentAcadMonth(String currentAcadMonth) {
		this.currentAcadMonth = currentAcadMonth;
	}
	public ArrayList<Integer> getCurrentSemPSSId() {
		return currentSemPSSId;
	}
	public void setCurrentSemPSSId(ArrayList<Integer> currentSemPSSIdList) {
		this.currentSemPSSId = currentSemPSSIdList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(Timestamp sessionDate) {
		this.sessionDate = sessionDate;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getProgramSemSubjectId() {
		return programSemSubjectId;
	}
	public void setProgramSemSubjectId(int programSemSubjectId) {
		this.programSemSubjectId = programSemSubjectId;
	}
	
	
	
}
