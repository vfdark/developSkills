import java.util.Scanner;

public class Ex7 {
    //! Write a java program that takes a number as input and prints its multiplication table up to 10.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = input.nextInt();
        int count = 1;
         while ( count <= 10)
        {
            System.out.println(number + "x" + count + "=" +(number * count));

            count++;
        }
       
        

    
}
}
