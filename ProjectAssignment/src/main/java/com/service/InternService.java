package com.service;

import com.models.Intern;

import java.util.List;

public interface InternService {
    List<Intern> getAllInterns();
    Intern getInternById(String id);
    Intern createIntern(Intern intern);
    Intern updateIntern(Intern intern);
    Intern  deleteIntern(Intern intern);
  //  int createIntern(Intern intern);
   List<Intern> getInternsCount();
   Intern deleteInternById(String id);
}
