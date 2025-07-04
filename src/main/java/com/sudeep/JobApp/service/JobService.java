package com.sudeep.JobApp.service;

import com.sudeep.JobApp.model.JobPost;
import com.sudeep.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost){
            repo.addJob(jobpost);
    }

    public List<JobPost> getJobs(){
        return repo.getAllJob();
    }
}
