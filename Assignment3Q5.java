public class Assignment3Q3 {
 public static void main(String args[]) {
 int currentValue = 5;
 System.out.println("The current value is: " + currentValue);
 if (currentValue > 0) {
 long factorial = 1;
 int x= 1;
 while (x <= currentValue) {
 factorial *= x;
 x++;
 }
 System.out.println("Factorial of " + currentValue + " is: " + factorial);
 } else {
 System.out.println("Factorial is not defined");
 }
 }
}
