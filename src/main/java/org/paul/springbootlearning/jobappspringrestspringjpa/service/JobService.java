package org.paul.springbootlearning.jobappspringrestspringjpa.service;

import org.paul.springbootlearning.jobappspringrestspringjpa.model.JobPost;
import org.paul.springbootlearning.jobappspringrestspringjpa.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;


    public List<JobPost> findAllJobPosts() {
        return jobRepo.findAllJobPosts();
    }

    public Optional<JobPost> findJobPostByPostId(int postId) {
        return jobRepo.findJobPostByPostId(postId);
    }

    public void addJobPost(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    /*public void updateJob(JobPost jobPost) {
        jobRepo.updateJob(jobPost);
    }

    public void deleteJobById(int postId) {
        jobRepo.deleteJobById(postId);
    }*/
}
