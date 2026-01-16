package org.paul.springbootlearning.jobappspringrestspringjpa.repo;

import org.paul.springbootlearning.jobappspringrestspringjpa.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    @Query("select j from JobPost j")
    List<JobPost> findAllJobPosts();

    @Query("select j from JobPost j where j.postId = ?1")
    Optional<JobPost> findJobPostByPostId(int postId);

    /*void deleteJobPostByPostId(int postId);*/
}
