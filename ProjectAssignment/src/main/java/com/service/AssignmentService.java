package com.service;

import com.models.Assignment;
import com.models.Intern;

import java.util.List;

public interface AssignmentService {
    List<Assignment> getAllAssignments();
    Assignment getAssignmentById(int id);
   Assignment createAssignment(Assignment assignment);
    Assignment updateAssignment(Assignment  assignment);
    Assignment deleteAssignment(Assignment assignment);
    List<Assignment> getAssignmentCount();

    Object getAssignmentByName(String name);
}
