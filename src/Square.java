import java.util.Scanner;

public class Square {
    public static void main(String[] args ){
        System.out.println("Enter a number to find its square");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();

        num=num*num;
        System.out.println(num);
    }
}
