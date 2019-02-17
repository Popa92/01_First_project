import java.util.Scanner;

public class Main {
//     1.Write a Java program that takes two numbers as input and display the product of two numbers.
public static void main(String[] args) {
    Scanner scanez = new Scanner(System.in);
    System.out.println("write the first number:");
    int x = scanez.nextInt();
    System.out.println("First number is:");
    System.out.println(x);

    System.out.println("write the second number:");
    int y = scanez.nextInt();
    System.out.println("Second number is:");
    System.out.println(y);


//     2.Write a Java program to display the following pattern
//      J    a   v     v  a
//      J   a a   v   v  a a
//  J  J  aaaaa   V V  aaaaa
//   JJ  a     a   V  a     a
    System.out.println("     J    a   v     v  a");
    System.out.println("     J   a a   v   v  a a");
    System.out.println("  J  J  aaaaa   V V  aaaaa");
    System.out.println("   JJ  a     a   V  a     a");

//    3.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    System.out.println("write a number");
    double a = scanez.nextDouble();
    System.out.println("write b number");
    double b = scanez.nextDouble();
    System.out.println("write c number");
    double c = scanez.nextDouble();
    System.out.println("(a+b+c)/3=");
    double average = ((a + b + c) / 3.0);
    System.out.println(average);

    //    4.Write a Java program to display the following pattern

    System.out.println(" +\"\"\"\"\"+");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  | ");
    System.out.println(" | '-' | ");
    System.out.println(" +-----+");
//
//    5.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
//    Test Data: Input ﬁrst number: 125 Input second number: 24 Expected Output :
//    125 + 24 = 149
//    125 - 24 = 101
//    125 x 24 = 3000 125 / 24 = 5
//    125 mod 24 = 5

    System.out.println(" 5. sum (addition), multiply, subtract, divide and remainder of two numbers.");
    System.out.println("write N number");
    double N = scanez.nextDouble();
    System.out.println("write M number");
    double M = scanez.nextDouble();
    System.out.println("SUM:");
    double sum = (N + M);
    System.out.println(sum);

    System.out.println("multiply:");
    double multiply = (N * M);
    System.out.println(multiply);

    System.out.println("divide:");
    double divide = (N / M);
    System.out.println(divide);

    System.out.println("reminder:");
    double reminder = (N % M);
    System.out.println(reminder);

    System.out.println("subtract:");
    double subtract = (N - M);
    System.out.println(subtract);


//    6.Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this formula: C = 5/9 * (F-32)

    System.out.println("Temperature convertor");
    System.out.println(" Write 1 if you want to convert from F to C ");
    System.out.println(" Write another natural number if you want to convert from C to F ");

    int G = scanez.nextInt();
    System.out.println("Write the temperature");
    float H = scanez.nextFloat();
    System.out.println("Converted temperature:");

    if (G == 1) {
        float K = 5 / 9f * (H - 32);
        System.out.println(K);
    } else {
        float K = H / (5 / 9f) + 32;
        System.out.println(K);

    }

    //  7.Write a Java program that reads a number in inches, converts it to meters.
    //  ( one inch is 0.0254 meters)
    System.out.println("Metric convertor");
    System.out.println(" Write 1 if you want to convert from inches to meters ");
    System.out.println(" Write another natural number if you want to convert from meters to inches ");

    int O = scanez.nextInt();
    System.out.println("Write the dimension");
    float P = scanez.nextFloat();
    System.out.println("Converted dimension:");

    if (G == 1) {
        float j = 0.0254f * P;
        System.out.println(j);
    } else {
        float j = 39.37f * P;
        System.out.println(j);

    }


//    8.Write a Java program to takes the user for a
//    distance (in meters) and the time was taken
//    (as three numbers: hours, minutes, seconds),
//    and display the speed, in meters per second,
//    kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
    System.out.println("Speed calculator");
    System.out.println("Write the distance you have traveled in meters");
    float DIS = scanez.nextFloat();
    System.out.println("Write the required hours, than minutes, than seconds for your travel ");
    System.out.println("Write the required hours for your travel ");
    float HR = scanez.nextFloat();
    System.out.println("Write the required minutes for your travel ");
    float MIN = scanez.nextFloat();
    System.out.println("Write the required second for your travel ");
    float SEC = scanez.nextFloat();


    System.out.println("Your speed m/s");
    double speed = DIS / ((HR*60*60) * MIN*60 + SEC);
    System.out.println(speed);

    System.out.println("Your speed mile/h");
    double speed2 = DIS*0.000621371 / (HR * (MIN/60) + (SEC/60/60));
    System.out.println(speed2);




}
}
