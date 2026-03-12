package HW9.prob4;

public class Test {
    static void main(String[] args) {
        TicketingSystem ts = new TicketingSystem();
        System.out.println(ts);
        ts.addTicket("Pop");
        ts.addTicket("Rock");
        ts.addTicket("Paper");
        ts.addTicket("Scissors");
        System.out.println(ts);
        System.out.println("Processed: "+ts.processTicket());
        System.out.println("Processed: "+ts.processTicket());
        System.out.println(ts);
        System.out.println("Peek: "+ts.viewNextTicket());
        System.out.println(ts);
    }
}
