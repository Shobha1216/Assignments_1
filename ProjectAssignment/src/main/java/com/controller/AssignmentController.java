package com.controller;

import com.models.Assignment;
import com.models.Intern;
import com.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*@RequestMapping("/assignments")*/
@CrossOrigin("*")
public class AssignmentController {

    @Autowired
    @Qualifier("database1")
    private AssignmentService assignmentService;

public  AssignmentController(){

}


    @GetMapping("/getAssignmentCount")
    public List<Assignment> getAssignmentCount(){
        return assignmentService.getAssignmentCount();
    }
    @GetMapping("/getAllAssignments")
    public List<Assignment>getAllAssignments(){

    return assignmentService.getAllAssignments();
    }
    @RequestMapping(value = "/getAssignment/{id}", method = RequestMethod.GET)
    public Assignment getAssignmentById(@PathVariable("id") int id){
        return assignmentService.getAssignmentById(id);
    }


    @RequestMapping(value = "/createAssignment", method = RequestMethod.POST)
    public String createAssignment(@RequestBody Assignment assignment ) {
        assignmentService.createAssignment(assignment);
        System.out.println(assignment);
        return "assignment created successfully";
    }


    @RequestMapping(value = "/updateAssignment", method = RequestMethod.PUT)
    public String updateAssignment(@RequestBody Assignment assignment){
        assignmentService.updateAssignment(assignment);
        return "assignment Updated Successfully";
    }

    @RequestMapping(value = "/deleteIntern", method = RequestMethod.DELETE)
    public String deleteAssignment(@RequestBody Assignment assignment){
        assignmentService.deleteAssignment(assignment);
        return "assignment deleted successfully!";
    }


    @RequestMapping(value = "/getAssignmentName/{name}", method = RequestMethod.GET)
    public Object getAssignmentByName(@PathVariable("name") String name){
        return assignmentService.getAssignmentByName(name);
    }
}
