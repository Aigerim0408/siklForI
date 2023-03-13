import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println ( num  + " * " + i + " = " + num * i);
        }*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i = i + 2) {
            System.out.println (i + "");
            sum +=i;
            }
        System.out.println(sum);   // vyvesti summu mejdu dvuh chisel

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
            System.out.println (i + "");
            sum+=i;
            }
        }
        System.out.println(sum); */ // slojenie nechetnyh chisel mejdu dvuh chisel


        }

    }


