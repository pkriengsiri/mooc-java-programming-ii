
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int container1Qty = 0;
        int container2Qty = 0;


        while (true) {
            
            System.out.println("First: " + container1Qty +"/100");
            System.out.println("Second: " + container2Qty +"/100");
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputs = input.split(" ");
            String command = inputs[0];
            int number = Integer.valueOf(inputs[1]);
            
            if(number <= 0) {
                continue;
            }
            
            switch(command) {
                case "add": {
                    container1Qty += number;
                    if(container1Qty > 100) {
                        container1Qty = 100;
                    }
                    break;
                }
                case "move": {
                    container1Qty -= number;
                    
                    if(container1Qty <=0) {
                        container2Qty += container1Qty + number;
                        container1Qty = 0;
                        
                        if(container2Qty > 100) {
                            container2Qty = 100; }
                        
                    } else {
                        container2Qty += number;
                                                if(container2Qty > 100) {
                            container2Qty = 100; }
                    }
                    break;
                }
                case "remove": {
                    container2Qty -= number;
                    if(container2Qty <0) {
                            container2Qty = 0; }
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
                
            }

        }
    }

}
