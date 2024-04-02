package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.JobPost;
import com.web.repository.JobRepoDb;

@Service
public class JobService {

	@Autowired
	JobRepoDb rep;
	// JobRepo rep;

	public void addJob(JobPost jobPost) {
		rep.save(jobPost);
	}

	public List<JobPost> getJobs() {

		return rep.findAll();
	}

	public Optional<JobPost> getJob(int jobId) {
		return rep.findById(jobId);
	}

	public void updateJob(JobPost job) {
		rep.save(job);

	}

	public void deleteJob(int jobId) {
		rep.deleteById(jobId);

	}

	public List<JobPost> postExp(int postExp) {
		return rep.findByExperience(postExp);
	}

	public List<JobPost> jobDesc(String JobDesc) {
		return rep.findByJobDesc(JobDesc);
	}

	public List<JobPost> jobDescCon(String JobDesc) {
		return rep.findByJobDescContains(JobDesc);
	}

	public List<JobPost> findByJobDescContains(String jobDesc) {
		return rep.findByPostDescTest(jobDesc);
	}

}
