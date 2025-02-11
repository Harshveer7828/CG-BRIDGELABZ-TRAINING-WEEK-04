package com.capgemini.mulitlevel_university_management_system;

import com.capgemini.multilevel_university_management_system.Course;
import com.capgemini.multilevel_university_management_system.CourseType;
import com.capgemini.multilevel_university_management_system.ExamCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityManagementSystemTest {
    // Creating the course
    CourseType examBased = new ExamCourse(100);
    Course<ExamCourse> course1 = new Course("Java Programming","3-Months",5000,examBased);

    @Test
    void course1Test(){
        assertEquals("Java Programming",course1.getCourseName());
        assertEquals(5000,course1.getPrice());
        assertEquals(examBased,course1.getCourseType());
    }

}
