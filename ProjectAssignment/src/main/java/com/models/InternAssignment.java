package com.models;


import javax.persistence.*;

@Entity
@Table(name="`internassignment`")

public class InternAssignment {

//    @SequenceGenerator(name="pk_sequence",sequenceName="" +
//            "", allocationSize=1)
//
//   @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    @Id
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="internid",referencedColumnName = "id")
    private Intern intern;

    @ManyToOne
    @JoinColumn(name="assignmentid",referencedColumnName = "id")
    private Assignment assignment;

    @Column(name="status")
    private String status;

    @Column(name="remarks")
    private int remarks;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getStatus() {
        return status;
    }

    public int getRemarks() {
        return remarks;
    }

    public void setRemarks(int remarks) {
        this.remarks = remarks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    @Override
    public String toString() {
        return "InternAssignment{" +
                "id=" + id +
                ", intern=" + intern +
                ", assignment=" + assignment +
                ", status='" + status + '\'' +
                ", remarks=" + remarks +
                '}';
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

}
