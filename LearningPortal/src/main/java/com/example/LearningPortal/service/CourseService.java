package com.example.LearningPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearningPortal.Entity.CourseEntity;
import com.example.LearningPortal.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository CourseRepo;
	
//	Getting Entities
	public CourseEntity saveDetail(CourseEntity courseEntity)
	{
		return CourseRepo.save(courseEntity);
	}
	public List<CourseEntity> saveDetails(List<CourseEntity> courses)
	{
		return CourseRepo.saveAll(courses);
	}
	
//	show all
	public List<CourseEntity> showAll(List<CourseEntity> courses)
	{
		return CourseRepo.findAll();
	}
	
//	get by ID
	public CourseEntity getById(int courseId)
	{
		return CourseRepo. findById(courseId).orElse(null);
	}
	
////	get by CourseName
//	public CourseEntity getByName(String courseName)
//	{
//		return CourseRepo.findByName(courseName).orElse(null);
//	}
//	
////	get by Category
//	public CourseEntity getByCategory(String category)
//	{
//		return CourseRepo.findByCategory(category).orElse(null);
//	}
	
//	delete Course
	public String deleteCourse(int courseId)
	{
		CourseRepo.deleteById(courseId);
		return "Course Id "+courseId+" deleted Successfully";
	}
	
//	edit Course details
	public CourseEntity updateCourse(CourseEntity course)
	{
		CourseEntity existingCourse = CourseRepo.findById(course.getCourseId()).orElse(null);
		existingCourse.setCourseName(course.getCourseName());
		existingCourse.setCategory(course.getCategory());
		existingCourse.setDuration(course.getDuration());
		existingCourse.setPrice(course.getPrice());
		existingCourse.setTotalParticipants(course.getTotalParticipants());
		return CourseRepo.save(existingCourse);
	}
}
