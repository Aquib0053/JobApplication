package com.web.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "jobpost")
public class JobPost {
	@Id
	private int jobId;
	private String jobProfile;
	private String jobDesc;
	private int experience;
	private String prevCompany;
	private List<String> techStack;

	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobPost(int jobId, String jobProfile, String jobDesc, int experience, String prevCompany,
			List<String> techStack) {
		super();
		this.jobId = jobId;
		this.jobProfile = jobProfile;
		this.jobDesc = jobDesc;
		this.experience = experience;
		this.prevCompany = prevCompany;
		this.techStack = techStack;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPrevCompany() {
		return prevCompany;
	}

	public void setPrevCompany(String prevCompany) {
		this.prevCompany = prevCompany;
	}

	public List<String> getTechStack() {
		return techStack;
	}

	public void setTechStack(List<String> techStack) {
		this.techStack = techStack;
	}

	@Override
	public String toString() {
		return "JobPost [jobId=" + jobId + ", jobProfile=" + jobProfile + ", jobDesc=" + jobDesc + ", experience="
				+ experience + ", prevCompany=" + prevCompany + ", techStack=" + techStack + "]";
	}
}
