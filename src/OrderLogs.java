import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
    private ArrayDeque<String>orderLogs;
    public boolean bool = true;

    OrderLogs(){
        orderLogs=new ArrayDeque<>();
    }

    public void addOrderLog(String log){
        orderLogs.push(log);
    }

    private void mostRecentLogEntry(){
        System.out.println(orderLogs.peek());
    }

    private String getOrderLog(){
        return orderLogs.pop();
    }

    private void removeAllLogEntries(){
        orderLogs.clear();
    }

    private boolean orderLogsEmpty(){
        return orderLogs.isEmpty();
    } 

    public void displayOrderLogs() {
        for (String log:orderLogs) {
            System.out.println(log);
        }
    }

    public void handleLogs(){
        Scanner input = new Scanner(System.in);
        do {
        System.out.println(" Choose what you wantto do with order logs:\n"+
                        " 1. Display all the logs\n"+
                        " 2. Display the most recent logs\n"+
                        " 3. Remove a log entry\n"+
                        " 4. Remove alllog entries\n"+
                        " 5. Check if the log is completely empty\n"+
                        " Enter your choice (1-5)");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                displayOrderLogs();
                break;
            case 2:
                mostRecentLogEntry();
                break;
            case 3:
                getOrderLog();
                break;
            case 4:
                removeAllLogEntries();
                break;
            case 5:
                orderLogsEmpty();
                if(orderLogs.isEmpty()){
                    System.out.println("The log is completely empty");
                }else{
                    System.out.println("”The log is not completely empty");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                bool = false;
        }
    }while(bool=false);
    input.close();
    }
}
