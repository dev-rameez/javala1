import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<String> queue;

    public QueueManager() {
        queue = new LinkedList<>();
    }

    public void addCustomer(String name) {
        queue.add(name);
    }

    public int getWaitingTime(String name) {
        int position = 0;
        for (String customer : queue) {
            if (customer.equals(name))
                break;
            position++;
        }
        return position * 10; // Assuming 10 minutes per customer
    }

    public int getCustomersAhead(String name) {
        int position = 0;
        for (String customer : queue) {
            if (customer.equals(name))
                break;
            position++;
        }
        return position;
    }
}
