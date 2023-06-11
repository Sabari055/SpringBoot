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

import com.example.LearningPortal.Entity.CourseEntity;
import com.example.LearningPortal.service.CourseService;



@RestController
public class CourseController {


	@Autowired
	private CourseService courseService;
	
	@PostMapping("/addCourse")
	public CourseEntity addCourse(@RequestBody CourseEntity courseEntity)
	{
		return courseService.saveDetail(courseEntity);
	}

	@PostMapping("/addCourses")
	public List<CourseEntity> addCourses(@RequestBody List<CourseEntity> courseEntities)
	{
		return courseService.saveDetails(courseEntities);
	}
	
	@GetMapping("/CourseList")
	public List<CourseEntity> show(List<CourseEntity> courses)
	{
		return courseService.showAll(courses);
	}
	
	@GetMapping("/Course/{courseId}")
	public CourseEntity showById(@PathVariable int courseId)
	{
		return courseService.getById(courseId);
	}
//	@GetMapping("/Course/{courseName}")
//	public CourseEntity showByName(@PathVariable String courseName)
//	{
//		return courseService.getByName(courseName);
//	}
//	@GetMapping("/Course/{category}")
//	public CourseEntity showByCategory(@PathVariable String category)
//	{
//		return courseService.getByCategory(category);
//	}
	
	@DeleteMapping("/DeleteCourse/{courseId}")
	public String delete(@PathVariable int courseId)
	{
		return courseService.deleteCourse(courseId);
	}
	
	@PutMapping("/UpdateCourse")
	public CourseEntity updateCourse(@RequestBody CourseEntity courseEntity)
	{
		return courseService.updateCourse(courseEntity);
	}
}
