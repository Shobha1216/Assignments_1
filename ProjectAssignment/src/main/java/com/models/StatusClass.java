package com.models;

import javax.persistence.*;

@Entity
@Table(name="`internassignment`")
public class StatusClass {

        @Id
        @Column(name="id")
        private int id;


        @JoinColumn(name="internid",referencedColumnName = "id")
        private String internId;


        @JoinColumn(name="assignmentid",referencedColumnName = "id")
        private int assignmentId;

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


    public String getInternId() {
        return internId;
    }

    public void setInternId(String internId) {
        this.internId = internId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
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

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", internId='" + internId + '\'' +
                ", assignmentId=" + assignmentId +
                ", status='" + status + '\'' +
                ", remarks=" + remarks +
                '}';
    }
}


