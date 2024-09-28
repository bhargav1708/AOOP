package com.customersupport.ticketsystem;

import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t1.getTimestamp().compareTo(t2.getTimestamp()); // Sort by timestamp
    }
}
