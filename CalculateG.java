import java.util.Scanner;

class CalculateG {

    public static double multiplication(double x, double y) {
    return x * y ;
    }
    public static double square(double x) {
    return x *x ;
    }
     public static double summation(double x, double y) {
    return x + y;
    }

    public static void outline(String message , double result){
        System.out.println(message + result);
    }

    public static void main(String[] arguments){

   Scanner input = new Scanner(System.in);

    double gravity =-9.81; // Earth's gravity in m/s^2
    double fallingTime = 30;
    double initialVelocity = 0.0;
    double finalVelocity;
    double initialPosition = 0.0;
    double finalPosition ;

    // Add the formulas for position and velocity

   // 𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
   finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
   finalPosition = finalPosition / fallingTime;
   //𝑣(𝑡) = 𝑎𝑡 + 𝑣i
   finalVelocity = gravity * fallingTime + initialVelocity;
   finalVelocity = finalVelocity / fallingTime;

   System.out.println("The object 's position after " + fallingTime + " seconds is "
    + finalPosition + " m.");


    // Add output line for velocity (similar to position)
    System.out.println("The object 's velocity after " + fallingTime + " seconds is "
    + finalVelocity + " m.");

    double num1 , num2;
    System.out.println("Enter the first number");
    num1 = input.nextDouble();
    System.out.println("Enter the second number");
    num2 = input.nextDouble();

    double multiplicationResult = multiplication(num1, num2);
    double squareResult1 = square(num1);
    double squareResult2 = square(num2);
    double summationResult = summation(num1 ,num2);

    outline(" multiplication result:" , multiplicationResult);
    outline("square for first number:" , squareResult1);
    outline("square for second number:" , squareResult2);
    outline("summation result:" , summationResult);

    }
    }
    