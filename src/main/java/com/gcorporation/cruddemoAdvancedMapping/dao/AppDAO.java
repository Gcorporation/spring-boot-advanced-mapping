package com.gcorporation.cruddemoAdvancedMapping.dao;

import com.gcorporation.cruddemoAdvancedMapping.entity.Course;
import com.gcorporation.cruddemoAdvancedMapping.entity.Instructor;
import com.gcorporation.cruddemoAdvancedMapping.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findinstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetialById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);
}
