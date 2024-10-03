package calc;

import java.io.Console;

public class calculator{
    public static void main(String[] args){

        // declare an accumulator
        float result = 0;

        float value = 0;
        // continue performing calculations or not
        boolean stop = false;

        Console cons = System.console();
        while (!stop){

    
            // read a line and trim it
            String cmd = cons.readLine("CMD> ").trim();

            switch (cmd){
                // ADD 5 6 7 8 - use split function in String class
                case "ADD":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    result += value;
                    break;

                // SUB 5 6 7 8
                case "SUB":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    result -= value;
                    break;

                // MUL 5 6 7 8
                case "MUL":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    result *= value;
                    break;

                case "DIV":
                    cmd = cons.readLine("VAL> ").trim();
                    value = Float.parseFloat(cmd);
                    result /= value;
                    break;
                // initialise the accumulator to 0
                case "INIT":
                    result = 0;
                    break;
                
                case "BRK":
                    stop = true;
                    break;
                
                case "SHOW":
                    System.out.printf("> %f\n", result);
                    break;
        }
    }

    }
}