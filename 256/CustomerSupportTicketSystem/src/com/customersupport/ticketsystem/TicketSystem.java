package com.customersupport.ticketsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketSystem {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create tickets
        Ticket ticket1 = new Ticket(1, "Alice", "Login issue", "High");
        Ticket ticket2 = new Ticket(2, "Bob", "Payment issue", "Medium");
        Ticket ticket3 = new Ticket(3, "Charlie", "Network issue", "Low");

        // Clone a ticket
        Ticket clonedTicket = ticket1.clone();

        // Store tickets in a list
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);

        // Sort using Comparable (based on priority)
        Collections.sort(ticketList);
        System.out.println("Tickets sorted by priority (Comparable):");
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }

        // Sort using Comparator (based on timestamp)
        Collections.sort(ticketList, new TicketComparator());
        System.out.println("\nTickets sorted by timestamp (Comparator):");
        for (Ticket ticket : ticketList) {
            System.out.println(ticket);
        }

        // Use Iterator to loop through tickets
        TicketIterator ticketIterator = new TicketIterator(ticketList);
        System.out.println("\nIterating over tickets:");
        while (ticketIterator.hasNext()) {
            System.out.println(ticketIterator.next());
        }
    }
}
