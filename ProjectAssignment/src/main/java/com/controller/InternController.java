package com.controller;

import com.models.Intern;
import com.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interns")
@CrossOrigin(origins = "*")
public class InternController {

    @Autowired
    @Qualifier("database")
    public InternService internService;

   public InternController(){

   }

    @GetMapping("/getInternCount")
    public List<Intern> getInternCount(){
        return internService.getInternsCount();
    }

    @GetMapping("/getAllInterns")
    public List<Intern> getAllInterns(){
        return internService.getAllInterns();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Intern getInternById(@PathVariable("id") String id){
        return internService.getInternById(id);
    }

    @PostMapping("/createIntern")
    public String  createIntern(@RequestBody Intern intern){
        internService.createIntern(intern);
        return "Intern created";
    }

   /* @RequestMapping(value = "/createIntern", method = RequestMethod.POST)
    public String createIntern(@RequestBody Intern intern){
        if(internService.createIntern(intern)>0){
            return "Intern created!";
        }
        return "Intern not created!";
    }*/
    @RequestMapping(value = "/updateIntern", method = RequestMethod.PUT)
    public String updateIntern(@RequestBody Intern intern){
        internService.updateIntern(intern);
        return "intern updated!";
    }
    @RequestMapping(value = "/deleteIntern", method = RequestMethod.DELETE)
    public String deleteIntern(@RequestBody Intern intern){
        internService.deleteIntern(intern);
        return "intern deleted!";
    }
    @DeleteMapping("/del")
    public Intern deleteInternById(@RequestParam(name = "id") String id){
        return internService.deleteInternById(id);
    }

}
