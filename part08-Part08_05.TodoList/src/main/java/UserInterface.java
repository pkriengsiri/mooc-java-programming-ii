
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            switch (command) {
                case "add": {
                    System.out.print("To add: ");
                    String input = scanner.nextLine();
                    this.list.add(input);
                    break;
                }
                case "remove": {
                    System.out.print("Which one is removed? ");
                    int input = Integer.valueOf(scanner.nextLine());
                    this.list.remove(input);
                    break;
                }
                case "list": {
                    this.list.print();
                    break;
                }
                default: {
                    System.out.println("Unknown command");
                }
            }
        }
    }

}
