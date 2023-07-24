package com.example.jobSearch.controller;

import com.example.jobSearch.model.JobSearch;
import com.example.jobSearch.service.JobSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobSearchController {
    @Autowired
    JobSearchService jobSearchService;

    @GetMapping("all")
    public Iterable<JobSearch> getAllJob(){
        return jobSearchService.getAllJob();
    }

    @PostMapping("save-all")
    public String saveAll(@RequestBody List<JobSearch> jobSearchList){
        jobSearchService.saveAll(jobSearchList);
        return "Added....";
    }
    @GetMapping("job-title/{jobtitle}")
    public List<JobSearch> FindByJobTitle(@PathVariable String jobtitle){
        return jobSearchService.FindByJobTitle(jobtitle);
    }
    @GetMapping("job-location/{location}")
    public List<JobSearch> FindByJobLocation(@PathVariable String location){
        return jobSearchService.FindByJobLocation(location);
    }
    @GetMapping("employer-name/{name}")
    public List<JobSearch> FindByEmployerName(@PathVariable String name){
        return jobSearchService.FindByEmployerName(name);
    }

    @PutMapping("byid/{id}/{salary}")
    public String UpdateById(@PathVariable Long id,@PathVariable Double salary){
        jobSearchService.UpdateByID(id,salary);
        return "Salary updated.....";
    }

    @DeleteMapping("byid/{id}")
    public String DeleteById(@PathVariable Long id){
        jobSearchService.DeleteById(id);
        return "Successfully deleted";
    }
}
