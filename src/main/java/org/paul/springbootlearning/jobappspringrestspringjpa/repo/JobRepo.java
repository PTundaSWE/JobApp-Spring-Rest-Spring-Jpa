package org.paul.springbootlearning.jobappspringrestspringjpa.repo;

import org.paul.springbootlearning.jobappspringrestspringjpa.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    /*public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJobById(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId){
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job : jobs) {
            if (job.getPostId() == jobPost.getPostId()) {
                job.setPostProfile(jobPost.getPostProfile());
                job.setReqExperience(jobPost.getReqExperience());
            }else{
                throw new RuntimeException("Job post id " + jobPost.getPostId() + " not found");
            }
        }
    }

    public void deleteJobById(int postId) {
        jobs.removeIf(job -> job.getPostId() == postId);
for(JobPost jobPost : jobs){
            if(jobPost.getPostId() == postId){
                jobs.remove(jobPost);
            }
        }

    }*/
}
