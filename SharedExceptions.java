package Opdrachten.Exception;

import java.util.Scanner;

public class SharedExceptions {
    public static void main(String[] args) {
        try{
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
            keyboard.close();
        }catch(NumberFormatException | ArithmeticException sharedException){
            System.out.println("Invalid number");
            System.out.println(sharedException.getMessage());
            sharedException.printStackTrace();
        }
    }
}
