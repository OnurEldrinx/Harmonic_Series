import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double number;
        double result=0;



        while (true){


            System.out.print("Enter a number:");
            number = scanner.nextInt();

            if (number <= 0){

                System.out.println("!!! Number can't equals a negative number or zero !!!");
                break;
            }


            for (double i=1;i<=number;i++){

                result = result + (1/i);

            }

            System.out.println("Harmonic Series of "+number+"\n------------------------");
            System.out.println("Result = " + result + "\n------------------------\n");

            result = 0;//Delete the last value.

        }

    }
}
