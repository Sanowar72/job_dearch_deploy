package com.example.jobSearch.service;

import com.example.jobSearch.model.JobSearch;
import com.example.jobSearch.repo.JobSearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSearchService {
    @Autowired
    JobSearchRepo jobSearchRepo;
    public Iterable<JobSearch> getAllJob() {
        return jobSearchRepo.findAll();
    }

    public void saveAll(List<JobSearch> jobSearchList) {
        jobSearchRepo.saveAll(jobSearchList);
    }

    public List<JobSearch> FindByJobTitle(String jobtitle) {
        return jobSearchRepo.findByJobTitle(jobtitle);
    }

    public List<JobSearch> FindByJobLocation(String location) {
        return jobSearchRepo.findByJobLocation(location);
    }

    public List<JobSearch> FindByEmployerName(String name) {
        return jobSearchRepo.findByEmployerName(name);
    }

    public void DeleteById(Long id) {
        jobSearchRepo.deleteById(id);
    }

    public void UpdateByID(Long id, Double salary) {
        Optional<JobSearch> tempData= jobSearchRepo.findById(id);
        JobSearch myData=tempData.get();
        myData.setJobSalary(salary);
        jobSearchRepo.save(myData);
    }
}
