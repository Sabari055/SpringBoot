package com.example.LearningPortal.repository;


//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.LearningPortal.Entity.CourseEntity;

@EnableJpaRepositories
public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

//	Optional<CourseEntity> findByName(String courseName);
//
//	Optional<CourseEntity> findByCategory(String category);

}
