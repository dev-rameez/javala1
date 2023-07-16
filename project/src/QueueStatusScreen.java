
import javax.swing.*;
import java.awt.*;

public class QueueStatusScreen extends JFrame {
    private JLabel nameLabel;
    private JLabel waitingTimeLabel;
    private JLabel customersAheadLabel;
    JButton addCustomer;


    public QueueStatusScreen() {
        addCustomer = new JButton();
        setTitle("Queue Status");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Name: ");
        waitingTimeLabel = new JLabel("Waiting Time: ");
        customersAheadLabel = new JLabel("Customers Ahead: ");

        add(nameLabel);
        add(waitingTimeLabel);
        add(customersAheadLabel);
        add(addCustomer);

        setVisible(true);
    }

    public void updateQueueStatus(String name, int waitingTime, int customersAhead) {
        nameLabel.setText("Name: " + name);
        waitingTimeLabel.setText("Waiting Time: " + waitingTime + " minutes");
        customersAheadLabel.setText("Customers Ahead: " + customersAhead);
    }
}
