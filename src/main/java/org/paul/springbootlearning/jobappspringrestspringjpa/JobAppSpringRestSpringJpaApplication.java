package org.paul.springbootlearning.jobappspringrestspringjpa;

import org.paul.springbootlearning.jobappspringrestspringjpa.model.JobPost;
import org.paul.springbootlearning.jobappspringrestspringjpa.repo.JobRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JobAppSpringRestSpringJpaApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(JobAppSpringRestSpringJpaApplication.class, args);

       JobRepo repo = context.getBean(JobRepo.class);

        JobPost jobPost1 = context.getBean(JobPost.class);
        JobPost jobPost2 = context.getBean(JobPost.class);
        JobPost jobPost3 = context.getBean(JobPost.class);
        JobPost jobPost4 = context.getBean(JobPost.class);
        JobPost jobPost5 = context.getBean(JobPost.class);
        JobPost jobPost6 = context.getBean(JobPost.class);

        jobPost1.setPostId(1);
        jobPost1.setPostProfile("Java Developer");
        jobPost1.setPostDesc("Must have good experience in core Java and advanced Java");
        jobPost1.setReqExperience(2);
        jobPost1.setPostTechStack(List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"));

        jobPost2.setPostId(2);
        jobPost2.setPostProfile("Frontend Developer");
        jobPost2.setPostDesc("Experience in building responsive web applications using React");
        jobPost2.setReqExperience(3);
        jobPost2.setPostTechStack(List.of("HTML", "CSS", "JavaScript", "React"));

        jobPost3.setPostId(3);
        jobPost3.setPostProfile("Data Scientist");
        jobPost3.setPostDesc("Strong background in machine learning and data analysis");
        jobPost3.setReqExperience(4);
        jobPost3.setPostTechStack(List.of("Python", "Machine Learning", "Data Analysis"));

        jobPost4.setPostId(4);
        jobPost4.setPostProfile("Network Engineer");
        jobPost4.setPostDesc("Design and implement computer networks for efficient data communication");
        jobPost4.setReqExperience(5);
        jobPost4.setPostTechStack(List.of("Networking", "Cisco", "Routing", "Switching"));

        jobPost5.setPostId(5);
        jobPost5.setPostProfile("Mobile App Developer");
        jobPost5.setPostDesc("Experience in mobile app development for iOS and Android");
        jobPost5.setReqExperience(3);
        jobPost5.setPostTechStack(List.of("iOS Development", "Android Development", "Mobile App"));

        jobPost6.setPostId(6);
        jobPost6.setPostProfile("DevOps Engineer");
        jobPost6.setPostDesc("Implement and manage continuous integration and delivery pipelines");
        jobPost6.setReqExperience(4);
        jobPost6.setPostTechStack(List.of("DevOps", "CI/CD", "Docker", "Kubernetes"));

        repo.save(jobPost1);

    }

}
