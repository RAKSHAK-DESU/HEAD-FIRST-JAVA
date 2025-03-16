import java.util.Scanner;

public class DIVISION {

        public static void main(String[] args){
            System.out.println("Enter 1st number");
            Scanner scanner= new Scanner(System.in);
            float num2= scanner.nextFloat();

            System.out.println("Enter 2nd Number");
            float num1= scanner.nextFloat();

            float result= num2/num1;
            System.out.println(result);

        }


}
