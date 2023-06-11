package com.example.LearningPortal.Entity;

//import org.springframework.data.annotation.Id;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Course")
public class CourseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	

	private String courseName;
	

	private String category;
	
	
	private int price;
	
	
	private int duration;
	

	private int totalParticipants;


	public CourseEntity() {
		super();
	}


	public CourseEntity(int courseId, String courseName, String category, int price, int duration,
			int totalParticipants) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.price = price;
		this.duration = duration;
		this.totalParticipants = totalParticipants;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getTotalParticipants() {
		return totalParticipants;
	}


	public void setTotalParticipants(int totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

	
}
