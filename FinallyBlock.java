package Opdrachten.Exception;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try{
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
        }catch(NumberFormatException | ArithmeticException sharedException){
            System.out.println("Invalid number");
            System.out.println(sharedException.getMessage());
            sharedException.printStackTrace();
        }
        finally {
            keyboard.close();
            System.out.println("The end (either good or bad)");
        }
    }
}
