package HW9.prob4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TicketingSystem {
    Queue<Ticket> tickets = new LinkedList<Ticket>();
    int nextId;

    public TicketingSystem() {
        nextId = new Random().nextInt();
    }

    public void addTicket(String description) {
        if (description == null)
            return;
        tickets.add(new Ticket(nextId, description));
        nextId = new Random().nextInt();
    }

    public Ticket processTicket() {
        if (tickets.isEmpty())
            return null;
        else return tickets.poll();
    }

    public Ticket viewNextTicket() {
        if (tickets.isEmpty())
            return null;
        else return tickets.peek();
    }

    @Override
    public String toString() {
        if (tickets.isEmpty())
            return "<empty>";
        final StringBuilder sb = new StringBuilder("Tickets: "+tickets.size()+"\n");
        tickets.forEach(t -> sb.append(t.toString()).append("\n"));
        return sb.toString();
    }
}
