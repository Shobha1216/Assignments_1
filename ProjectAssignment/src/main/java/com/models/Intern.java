package com.models;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="`intern`")
public class Intern {
    @Id
    @Column(name = "id")
    private String internId;

    @Column(name = "internname")
    private String internName;

    @Column(name = "email")
    private String email;

    @Column(name = "phoneno")
    private String phoneNo;

    @Column(name="imageurl")
    private String imageUrl;

//    public List<Assignment> getAssignments() {
//        return assignments;
//    }

//    public void setAssignments(List<Assignment> assignments) {
//        this.assignments = assignments;
//    }

//    @OneToMany(mappedBy = "assignment")
//    List<Assignment> assignments;
   /*@ManyToMany(mappedBy = "intern")
    private InternAssignment internAssignment;*/

    public String getInternId() {
        return internId;
    }


    public void setInternId(String internId) {
        this.internId = internId;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "internId='" + internId + '\'' +
                ", internName='" + internName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
