package com.gcorporation.cruddemoAdvancedMapping.dao;

import com.gcorporation.cruddemoAdvancedMapping.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findinstructorById(int theId);
}
