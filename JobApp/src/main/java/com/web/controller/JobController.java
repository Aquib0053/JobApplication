package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.JobPost;
import com.web.service.JobService;

@Controller
public class JobController {

	@Autowired
	JobService service;
	// welcome

	@RequestMapping({ "/", "/home" })
	public String home() {
		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/addjob")
	public String addJob() {
		return "addjob";
	}

	@RequestMapping("/handleForm")
	public String handleForm(@ModelAttribute("myJobPost") JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}

	@RequestMapping("/viewalljobs")
	public String getAllJobs(Model m) {
		List<JobPost> jobs = service.getJobs();
		m.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}

//	@GetMapping("/getjobs")
//	@ResponseBody
//	public List<JobPost> getJobs() {
//		return service.getJobs();
//	}

}
