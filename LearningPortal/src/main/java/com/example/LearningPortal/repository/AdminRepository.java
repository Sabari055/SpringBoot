package com.example.LearningPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.LearningPortal.Entity.AdminEntity;
 
//@Repository
@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

	AdminEntity findByMail(String mail);
 
}
