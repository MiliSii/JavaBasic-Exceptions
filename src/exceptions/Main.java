package exceptions;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        //TRY-CATCH

        try {
            String[] people ={"milica","ana"};
            System.out.println(people[8]);
        }catch (Exception e){
            System.out.println("an exception happend!");
        }


        try {
            Scanner s=new Scanner(System.in);
            System.out.println("input number: ");
            int number=s.nextInt();
            System.out.println(number);

        }catch (Exception e1){

            System.out.println("input must be number");
        }


        try {
            int[] i={8,8,8};
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }


         /*  int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!


        try {
            int[] myNumbers1 = {1, 2, 3};
            System.out.println(myNumbers1[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }


       try {
            int[] myNumbers3 = {1, 2, 3};
            System.out.println(myNumbers3[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


          checkAge(15); // Set age to 15 (which is below 18...)
          checkAge(20);//working
*/
//program to print the exception information using printStackTrace() method
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

//program to print the exception information using toString() method
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }

        //program to print the exception information using getMessage() method
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }


}