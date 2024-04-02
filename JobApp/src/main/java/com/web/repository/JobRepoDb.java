package com.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.model.JobPost;

@Repository
public interface JobRepoDb extends JpaRepository<JobPost, Integer> {
	List<JobPost> findByExperience(int experience);

	List<JobPost> findByJobDesc(String jobDesc);

	List<JobPost> findByJobDescContains(String jobDesc);

	@Query("select j from JobPost j where j.jobDesc LIKE %?1%")
	List<JobPost> findByPostDescTest(String jobDesc);

}
