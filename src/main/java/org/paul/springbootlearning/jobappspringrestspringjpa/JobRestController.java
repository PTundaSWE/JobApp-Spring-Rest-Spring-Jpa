package org.paul.springbootlearning.jobappspringrestspringjpa;

import org.paul.springbootlearning.jobappspringrestspringjpa.model.JobPost;
import org.paul.springbootlearning.jobappspringrestspringjpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    /*@Autowired
    private JobService jobService;

    @GetMapping("/jobPosts")
    public List<JobPost> findAllJobPosts() {
        return jobService.findAllJobPosts();
    }*/

    /*@GetMapping("/jobPosts/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId) {
        return jobService.getJobById(postId);
    }


    @PostMapping("/jobPosts")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobPost;
    }

    @PutMapping("/jobPosts")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("/jobPosts/{postId}")
    public String deleteJobById(@PathVariable("postId") int postId) {
        jobService.deleteJobById(postId);
        return "Delete Job Successfully";
    }*/
}
