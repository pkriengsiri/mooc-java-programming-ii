import java.util.Scanner;
public class UserInterface {
    
    private Container container1;
    
    private Container container2;
    
    private Scanner scanner;
    
    public UserInterface(Container container1, Container container2, Scanner scanner) {
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            
            System.out.print("> ");

            String input = scanner.nextLine();
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
                    container1.add(number);
                    break;
                }
                case "move": {
                    if(number > container1.contains()) {
                        number = container1.contains();
                    }
                    
                    container1.remove(number);
                    container2.add(number);
                    break;
                }
                case "remove": {
                    container2.remove(number);
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
    }
    
}
    }
}
