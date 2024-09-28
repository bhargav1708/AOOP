package com.customersupport.ticketsystem;

import java.util.Iterator;
import java.util.List;

public class TicketIterator implements Iterator<Ticket> {
    private List<Ticket> ticketList;
    private int position = 0;

    public TicketIterator(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    @Override
    public boolean hasNext() {
        return position < ticketList.size();
    }

    @Override
    public Ticket next() {
        if (this.hasNext()) {
            return ticketList.get(position++);
        }
        return null;
    }
}
