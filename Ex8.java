 import java.util.Scanner;
 public class Ex8 {
    //! Write java progoram to compute the specified exp and print the output
    //? test data : ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Write the First Number:");
            double number1 = input.nextDouble();
            System.out.println("Write the Second Number:");
            double number2 = input.nextDouble();
            System.out.println(" write the Third Number:");
            double number3 = input.nextDouble();
            System.out.println(" write the Fourth Number:");
            double number4 = input.nextDouble();
            System.out.println(" write the Fifth Number:");
            double number5 = input.nextDouble();
            System.out.println(" write the sixth Number:");
            double number6 = input.nextDouble();
            System.out.println((number1*number2 - number3*number4)/(number5-number6));
        }






    
}
}
  