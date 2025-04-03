import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        System.out.println("Enter a number to find square root");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();

        int result = (int) Math.sqrt(num);
        System.out.println(result);
    }
}
