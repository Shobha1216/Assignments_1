package com.service;

import com.models.InternAssignment;

import java.util.List;

public interface InternAssignmentService {
    List<InternAssignment> getAllInternAssignments();
    /*InternAssignment getInternAssignmentByInternId(String internId);*/
   /* List<InternAssignment> getAssignmentById(int internId);*/
      List<InternAssignment> metrics();
    InternAssignment createInternAssignment(InternAssignment internAssignment);
    InternAssignment updateInternAssignment(InternAssignment internAssignment);
    InternAssignment deleteInternAssignment(InternAssignment internAssignment);
  List <InternAssignment> getIsComplete();
    List <InternAssignment> getIsPending();
    List <InternAssignment> getIsReviewed();


}
