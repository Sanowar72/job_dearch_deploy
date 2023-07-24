package com.example.jobSearch.repo;

import com.example.jobSearch.model.JobSearch;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobSearchRepo extends CrudRepository<JobSearch,Long> {
    List<JobSearch> findByJobTitle(String jobTitle);
    List<JobSearch> findByJobLocation(String jobLocation);
    List<JobSearch> findByCompanyEmail(String companyEmail);
    List<JobSearch> findByEmployerName(String employerName);
}
