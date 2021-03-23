import java.util.Scanner;
public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Input first number
        System.out.println("First Number = ");
        float a = input.nextFloat();

        //Input second number
        System.out.println("Second Number = ");
        float b = input.nextFloat();

        //Input third number
        System.out.println("Third Number = ");
        float c = input.nextFloat();

        //Input fourth number
        System.out.println("Fourth Number = ");
        float d = input.nextFloat();

        //Input fifth number
        System.out.println("Fifth Number = ");
        float e = input.nextFloat();

        //Average Value
        double average = (a + b + c + d + e) / 5;
        System.out.println("Total Average is " + average);
    }
}
