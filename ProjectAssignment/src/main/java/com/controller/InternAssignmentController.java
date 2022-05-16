package com.controller;


import com.models.Intern;
import com.models.InternAssignment;
import com.service.InternAssignmentService;
import com.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class InternAssignmentController {

    @Autowired
    @Qualifier("database2")
    private InternAssignmentService internAssignmentService;

public InternAssignmentController(){

}
    @GetMapping("/getAllIsPending")
    public List<InternAssignment> getIsPending(){
        return internAssignmentService.getIsPending();
    }

    @GetMapping("/getAllIsReviewed")
    public List<InternAssignment> getIsReviewed(){
        return internAssignmentService.getIsReviewed();
    }


    @GetMapping("/getAllIsComplete")
    public List<InternAssignment> getIsComplete(){
        return internAssignmentService.getIsComplete();
    }

    @GetMapping("/getAllInternAssignments")
    public List<InternAssignment> getAllInternAssignments(){
        return internAssignmentService.getAllInternAssignments();
    }
    @Autowired
    @Qualifier("database")
    public InternService internService;

    /*@RequestMapping(value = "/getInternAssignment/{id}", method = RequestMethod.GET)
    public Intern getInternAssignmentById(@PathVariable("id") int id){

      InternAssignment internAssignment = internAssignmentService.getInternAssignmentById(id);

      String intern_Id =  internAssignment.getInternId();
     Intern intern=  internService.getInternById(String.valueOf(intern_Id));

        System.out.println(intern);

         return  intern;
    }*/

    @GetMapping("/getmetrics")
    public List<InternAssignment> metrics(){
        return internAssignmentService.metrics();
    }

    @PostMapping("/createInternAssignment")
    public String  createInternAssignment(@RequestBody InternAssignment internAssignment){
        internAssignmentService.createInternAssignment(internAssignment);
        return "InternAssignment created";
    }

    @RequestMapping(value = "/updateInternAssignment", method = RequestMethod.PUT)
    public String updateInternAssignment(@RequestBody InternAssignment internAssignment){
        System.out.println(internAssignment);
        internAssignmentService.updateInternAssignment(internAssignment);
        return "internAssignment updated!";
    }
    @RequestMapping(value = "/deleteInternAssignment", method = RequestMethod.DELETE)
    public String deleteInternAssignment(@RequestBody InternAssignment internAssignment){
        internAssignmentService.deleteInternAssignment(internAssignment);
        return "internAssignment deleted!";

    }

}

