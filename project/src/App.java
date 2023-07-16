import javax.swing.*;
import java.awt.*;

public class QueueStatusScreen extends JFrame {
    private JTextField customerNameField;
    private JTextField waitingTimeField;
    private JTextField customersAheadField;

    public QueueStatusScreen() {
        setSize(300, 300);
        setTitle("Queue Status");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Customer Name:"));
        customerNameField = new JTextField();
        add(customerNameField);

        add(new JLabel("Waiting Time:"));
        waitingTimeField = new JTextField();
        add(waitingTimeField);

        add(new JLabel("Customers Ahead:"));
        customersAheadField = new JTextField();
        add(customersAheadField);
    }

    public void updateQueueStatus(String name, int waitingTime, int customersAhead) {
        customerNameField.setText(name);
        waitingTimeField.setText(String.valueOf(waitingTime));
        customersAheadField.setText(String.valueOf(customersAhead));
    }
}
