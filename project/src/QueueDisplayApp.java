
public class QueueDisplayApp {
        private QueueStatusScreen queueStatusScreen;
        private QueueManager queueManager;
    
        public QueueDisplayApp() {
            queueStatusScreen = new QueueStatusScreen();
            queueManager = new QueueManager();
        }
    
        public void updateQueueStatusScreen() {
            String name = ""; // Get the customer name from user input or database
            queueManager.addCustomer(name);
    
            int waitingTime = queueManager.getWaitingTime(name);
            int customersAhead = queueManager.getCustomersAhead(name);
    
            queueStatusScreen.updateQueueStatus(name, waitingTime, customersAhead);
        }
    
        public static void main(String[] args) {
            QueueDisplayApp app = new QueueDisplayApp();
    
            // Perform periodic updates every 1 minute (adjust the interval as needed)
            while (true) {
                app.updateQueueStatusScreen();
                try {
                    Thread.sleep(60000); // 1 minute
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    

