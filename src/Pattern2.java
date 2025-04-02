import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //*********
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();

        for (int i=1;i<=num;i++){
            for(int j=1; j<=num-1; j++){
                System.out.print("");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
