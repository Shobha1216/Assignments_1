package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`Ticket`")
public class Ticket {

    @Id
    @Column(name="ticket_id")
    private int ticketId;

    @Column(name="theatre_Name")
    private String theatreName;

    @Column(name="date_of_movie")
    private String dateOfMovie;

    @Column(name="slot_time")
    private String slotTime;

    @Column(name="seat_no")
    private String seatNumber;

    public String getDateOfMovie() {
        return dateOfMovie;
    }

    public void setDateOfMovie(String dateOfMovie) {
        this.dateOfMovie = dateOfMovie;
    }


    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getSlotTime() {
        return slotTime;
    }
    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getTheatreName() {
        return theatreName;
    }
    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }


    public int getTicketId() {
        return ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", theatreName='" + theatreName + '\'' +
                ", dateOfMovie='" + dateOfMovie + '\'' +
                ", slotTime='" + slotTime + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
