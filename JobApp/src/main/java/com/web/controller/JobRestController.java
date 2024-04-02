package com.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.JobPost;
import com.web.service.JobService;

@RestController
public class JobRestController {

	@Autowired
	JobService service;
	//welcome

	@GetMapping("/getjobs")
	public List<JobPost> getJobs() {
		return service.getJobs();
	}

	@GetMapping("/getjob/{jobId}")
	public Optional<JobPost> getJob(@PathVariable int jobId) {
		return service.getJob(jobId);
	}

	@PostMapping("/getjobs")
	public String putJob(@RequestBody JobPost job) {
		service.addJob(job);
		return "success";
	}

	@PutMapping("/getjobs")
	public String updateJob(@RequestBody JobPost job) {
		service.updateJob(job);
		return "Updated";
	}

	@DeleteMapping("/getjobs/{jobId}")
	public String deleteJob(@PathVariable int jobId) {
		service.deleteJob(jobId);
		return "Deleted";
	}

	@GetMapping("/getjobExp/{postExp}")
	public List<JobPost> findPostExp(@PathVariable int postExp) {
		return service.postExp(postExp);
	}

	@GetMapping("/getjobDesc/{jobDesc}")
	public List<JobPost> findPostExp(@PathVariable String jobDesc) {
		return service.jobDesc(jobDesc);
	}

	@GetMapping("/getjobDesCon/{jobDescCon}")
	public List<JobPost> findJobDescCon(@PathVariable String jobDescCon) {
		return service.jobDescCon(jobDescCon);
	}

	@GetMapping("/getjob/desc/{jobDesc}")
	public List<JobPost> findByJobDescContains(@PathVariable String jobDesc) {
		return service.findByJobDescContains(jobDesc);
	}

}
