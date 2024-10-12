package cart;

// console-based shopping cart
// allows user to add, remove, and list the contents of a shopping cart 

import java.io.Console;
import java.util.LinkedList;
import java.util.List;


public class cart{

    // create a menu for user to decide what to do
    public static void menu(){
        System.out.println("Welcome to your shopping cart");
        System.out.println(("============================="));
        System.out.println();

        System.out.println("List items in the cart: type 'list'");
        System.out.println("Add item(s) into the cart: type 'add xxx, ..., yyy");
        System.out.println("Delete item from the cart: type 'delete 1'");
        System.out.println("Exit/Terminate program: 'type exit'");
    
    }

    public static void main(String[] args) {
        
        List<String> shoppingCart = new LinkedList<>();
        // Set<String> shoppingCart = new HashSet<>();
        
        boolean exit = false;

        while (!exit){

            menu();

            Console cons = System.console();

            String cmd = cons.readLine("> ");

            cmd = cmd.replaceAll("\\p{Punct}", "").toLowerCase();


            String[] command = cmd.trim().split(" ");

            switch (command[0]) {
                case "list": // cmd.equals("list")
                    if (shoppingCart.size() != 0){
                        for (int i = 0; i < shoppingCart.size(); i+= 1){
                            int index = i + 1;
                            System.out.printf("%d. %s\n", index, shoppingCart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty\n");
                    }
                    break;
                    
                case "add": // cmd.equals("add")
                    for (int i = 1; i < command.length; i += 1){
                        if (shoppingCart.contains(command[i])){
                            System.out.printf("You have %s in your cart\n", command[i]);
                        }
                        else{
                            shoppingCart.add(command[i]);
                            System.out.printf("%s added to cart\n", command[i]);
                        }
                    }
                    break;
                        
                case "delete": // cmd.equals("delete")
                    int deleteIndex = Integer.parseInt(command[1]) - 1;
                    if (deleteIndex < shoppingCart.size() && deleteIndex >= 0){
                        System.out.printf("%s removed from cart\n", shoppingCart.get(deleteIndex));
                        shoppingCart.remove(deleteIndex);
                    }
                    else {
                        System.out.println("Incorrect item index\n");
                    }
                    break;

                default:
                    System.out.println("Enter again\n");
                    break;

                case "exit":
                    // exit your shopping cart
                    System.out.println("You have exited your shopping cart\n");
                    exit = true;
                    break;
                
        }
    }
}
}