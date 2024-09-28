package com.customersupport.ticketsystem;

import java.util.Date;

public class Ticket implements Comparable<Ticket>, Cloneable {
    private int ticketID;
    private String customerName;
    private String issue;
    private Date timestamp;
    private String priority;

    // Constructor
    public Ticket(int ticketID, String customerName, String issue, String priority) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.issue = issue;
        this.timestamp = new Date();
        this.priority = priority;
    }

    // Getters and setters
    public int getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getPriority() {
        return priority;
    }

    // Override compareTo method for sorting based on priority
    @Override
    public int compareTo(Ticket otherTicket) {
        return this.priority.compareTo(otherTicket.priority);
    }

    // Implement cloning for creating copies
    @Override
    public Ticket clone() throws CloneNotSupportedException {
        return (Ticket) super.clone();
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + ", Customer: " + customerName + ", Issue: " + issue + ", Priority: " + priority;
    }
}
