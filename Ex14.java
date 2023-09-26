import java.util.Scanner;
public class Ex14 {
    //! write a java program to add two binary number.
    public static void main(String[] args) {
        int binary1, binary2;
        int i = 0; 
        int remainder = 0;
        int[] sum = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number");
        binary1 = scanner.nextInt();
        System.out.println("Enter the second binary number");
        binary2 = scanner.nextInt();
        while (binary1!= 0 || binary2!= 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) %2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 /= 10;
            binary2 /= 10;
        }
        if (remainder!= 0) {
            sum[i++] = remainder;
        }
        i--;
        System.out.println("the sum of the two binary number is ");
        while (i >= 0) {
            System.out.print(sum[i--]);

        }
    }
            
            

    }
    

    

