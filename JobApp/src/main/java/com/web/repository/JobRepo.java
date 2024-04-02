package com.web.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.model.JobPost;

@Repository
public class JobRepo {

	List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList());

	public void addJob(JobPost jobPost) {
		jobs.add(jobPost);

	}

	public List<JobPost> getJobs() {
		return jobs;
	}

	public JobPost getjob(int jobId) {
		for (JobPost job : jobs) {
			if (job.getJobId() == jobId) {
				return job;
			}
		}
		return null;
	}

	public void updateJob(JobPost job) {
		for (JobPost jb : jobs) {
			if (job.getJobId() == jb.getJobId()) {
				jb.setJobDesc(job.getJobDesc());
				jb.setExperience(job.getExperience());
				jb.setTechStack(job.getTechStack());

			}
		}

	}

	public void deleteJob(int JobId) {
		for (JobPost jb : jobs) {
			if (JobId == jb.getJobId()) {
				jobs.remove(jb);
			}
		}

	}

}
