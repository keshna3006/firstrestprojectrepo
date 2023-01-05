package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;


@Service
public class CourseServiceimpl implements CourseService{

	List<Courses> list;
	public CourseServiceimpl()
	{
		list=new ArrayList<>();
		list.add(new Courses(145,"Java Core","Contains basic of JAva"));
		list.add(new Courses(4343,"spring boot course","Creating spring boot applications"));
	}
	
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Courses getCourse(long courseId) {
		Courses c=null;
		
		for(Courses course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Courses addCourse(Courses course) {
		
		list.add(course);
		return course;
	}
	
	

}
