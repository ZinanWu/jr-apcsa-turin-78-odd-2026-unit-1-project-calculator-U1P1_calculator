package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double tip = cost * (percent/100.0);
        double tip1 = tip;
        tip = (double)(((int)(tip * 100 + 0.5)/100.0));
        double billWithTip = cost + tip1;
        double billWithTip1 = billWithTip;
         billWithTip = (double)(((int)(billWithTip * 100 + 0.5)/100.0));
        double perPersonBeforeTip = cost/people;
         perPersonBeforeTip = (double)(((int)(perPersonBeforeTip * 100 + 0.5)/100.0));
        double tipPerPerson = tip1/people;
         tipPerPerson = (double)(((int)(tipPerPerson * 100 + 0.5 )/100.0));
        double totalCostPerPerson = billWithTip1/people;
         totalCostPerPerson = (double)(((int)(totalCostPerPerson * 100 + 0.5 )/100.0));



        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + billWithTip + "\n" +
                       "Per person cost before tip: $" + perPersonBeforeTip + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalCostPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        Scanner input = new Scanner(System.in);
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
         double tip = cost * (percent/100.0);
        double tip1 = tip;
        tip = (double)(((int)(tip * 100 + 0.5)/100.0));
        double billWithTip = cost + tip1;
        double billWithTip1 = billWithTip;
         billWithTip = (double)(((int)(billWithTip * 100 + 0.5)/100.0));
        double perPersonBeforeTip = cost/people;
         perPersonBeforeTip = (double)(((int)(perPersonBeforeTip * 100 + 0.5)/100.0));
        double tipPerPerson = tip1/people;
         tipPerPerson = (double)(((int)(tipPerPerson * 100 + 0.5 )/100.0));
        double totalCostPerPerson = billWithTip1/people;
         totalCostPerPerson = (double)(((int)(totalCostPerPerson * 100 + 0.5 )/100.0));



        result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + billWithTip + "\n" +
                       "Per person cost before tip: $" + perPersonBeforeTip + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalCostPerPerson + "\n" +
                       "-------------------------------\n" + 
                       "Items ordered:\n";

    //}
        
    
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        

        while (condition) {
            //enter your code here
            System.out.println("Enter an item name or type '-1' to finish:");
            String item = input.nextLine();
            if (item.equals("-1")){
                condition= false;
            }
            else {
                result += item + "\n";
            }
   
        }
        result += "-------------------------------\n";
        return result;
    }


    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
