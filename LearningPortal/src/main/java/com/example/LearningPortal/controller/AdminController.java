package com.example.LearningPortal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LearningPortal.Entity.AdminEntity;
import com.example.LearningPortal.service.AdminService;

@RestController

public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/addAdmin")
	public AdminEntity addAdmin(@RequestBody AdminEntity admin)
	{
		return service.saveDetail(admin);
		
	}
	
	@PostMapping("/addAdmins")
	public List<AdminEntity> addAdmin(@RequestBody List<AdminEntity> admins)
	{
		return service.saveDetails(admins);
	}
	
	@GetMapping("/AdminList")
	public List<AdminEntity> showAll(List<AdminEntity> admin)
	{
		return service.getEntities();
	}
	
	@GetMapping("/Admin/{id}")
	public AdminEntity showById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/Admin/{mail}")
	public AdminEntity showByMail(@PathVariable String mail)
	{
		return service.getByMail(mail);
	}
	
	@DeleteMapping("/DeleteAdmin/{id}")
	public String delete(@PathVariable int id)
	{
		return service.deleteAdmin(id);
	}
	
	@PutMapping("/UpdateAdmin")
	public AdminEntity updateAdmin(@RequestBody AdminEntity admin)
	{
		return service.updateAdmin(admin);
	}
	
	
}