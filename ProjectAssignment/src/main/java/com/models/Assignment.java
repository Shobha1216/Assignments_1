package com.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="`assignment`")
public class Assignment {

    @Id
    @Column(name = "id")
    private int assignmentId;

    @Column(name="assignmentname")
    private String assignmentName;

    @Column(name="assignmentdescription")
    private String assignmentdescription;

    public String getAssignmentdescription() {
        return assignmentdescription;
    }

    public void setAssignmentdescription(String assignmentdescription) {
        this.assignmentdescription = assignmentdescription;
    }




   /* @OneToMany(mappedBy = "assignment")
    Set<InternAssignment> internAssignmentSet;*/


    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", assignmentName='" + assignmentName + '\'' +
                ", assignmentdescription='" + assignmentdescription + '\'' +
                '}';
    }
}
