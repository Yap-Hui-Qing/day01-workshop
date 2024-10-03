package calc;

import java.io.Console;

public class calculatorv2 {

    // constant
    public static final int CMD_POS = 0;
    // public: can be accessed by other classes
    // constant naming convention - in caps and separated by underscore
    // final cannot be changed

    public static void main(String[] args){

        // declare an accumulator
        float result = 0;

        float value = 0;
        // continue performing calculations or not
        boolean stop = false;

        Console cons = System.console();
        while (!stop){

    
            // read a line and trim it
            // ADD 1 2 3, BRK 
            String input = cons.readLine("CMD> ").trim();

            // split up into terms
            String[] valueList = input.split(" ");

            // ADD, BRK, ...
            switch (valueList[CMD_POS].toUpperCase()){
                // ADD 5 6 7 8 - use split function in String class
                case "ADD":
                    for (int idx = 1; idx < valueList.length; idx +=1){
                        value = Float.parseFloat(valueList[idx]);
                        result += value;
                    }
                    break;

                // SUB 5 6 7 8
                case "SUB":
                    for (int idx = 1; idx < valueList.length; idx +=1){
                        value = Float.parseFloat(valueList[idx]);
                        result += value;
                    }
                    break;

                // MUL 5 6 7 8
                case "MUL":
                    for (int idx = 1; idx < valueList.length; idx +=1){
                        value = Float.parseFloat(valueList[idx]);
                        result += value;
                    }
                    break;

                case "DIV":
                    value = Float.parseFloat(valueList[1]);
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
                    System.out.printf("> %.3f\n", result);
                    break;
        }
    }

    }
}

