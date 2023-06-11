package com.example.LearningPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearningPortal.Entity.AdminEntity;
import com.example.LearningPortal.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
//	Getting Entity Details
	public AdminEntity saveDetail(AdminEntity admin)
	{
		return adminRepo.save(admin);
	}
	
	public List<AdminEntity> saveDetails(List<AdminEntity> admins)
	{
		return adminRepo.saveAll(admins);
	}
	
//	get all the Entities
	public List<AdminEntity> getEntities()
	{
		return adminRepo.findAll();
	}
	
//	get by ID
	public AdminEntity getById(int id)
	{
		return adminRepo. findById(id).orElse(null);
	}
	
//	get by Email
	public AdminEntity getByMail(String mail)
	{
		return adminRepo.findByMail(mail);
	}
	
//	delete admin
	public String deleteAdmin(int id)
	{
		adminRepo.deleteById(id);
		return "Admin Id "+id+" deleted Successfully";
	}

	
//	edit Admin details
	public AdminEntity updateAdmin(AdminEntity admin)
	{
		AdminEntity existingAdmin = adminRepo.findById(admin.getId()).orElse(null);
		existingAdmin.setName(admin.getName());
		existingAdmin.setMail(admin.getMail());
		existingAdmin.setContact(admin.getContact());
		return adminRepo.save(existingAdmin);
	}
 
}