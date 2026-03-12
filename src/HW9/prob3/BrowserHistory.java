package HW9.prob3;

import java.util.Stack;

public class BrowserHistory {
    String currentUrl;
    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();

    public BrowserHistory() {
    }

    public BrowserHistory(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public void visit(String url) {
        back.push(currentUrl);
        currentUrl = url;
        System.out.println("Visited: " + currentUrl);
    }

    public void back() {
        if (back.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }
        forward.push(currentUrl);
        currentUrl = back.pop();
        System.out.println("Back to: " + currentUrl);
    }

    public void forward() {
        if (forward.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }
        back.push(currentUrl);
        currentUrl = forward.pop();
        System.out.println("Forward to: " + currentUrl);
    }
}
