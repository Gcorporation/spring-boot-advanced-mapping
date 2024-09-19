package com.gcorporation.cruddemoAdvancedMapping.dao;

import com.gcorporation.cruddemoAdvancedMapping.entity.Instructor;
import com.gcorporation.cruddemoAdvancedMapping.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findinstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetialById(int theId);

    void deleteInstructorDetailById(int theId);
}
