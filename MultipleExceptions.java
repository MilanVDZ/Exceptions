package Opdrachten.Exceptions;

import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        try{
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d", num, den, div);
            keyboard.close();
        }catch(ArithmeticException ae){
            System.out.println("Division by 0");

        }
    }
}
