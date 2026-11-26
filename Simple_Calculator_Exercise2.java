/*
Exercise 2: Simple calculator

Declare two integer variables:
int num1 = 25;
int num2 = 5;


Print:
1. Their sum.
2. Their difference.
3. Their product.
4. Their division.
Expected output:
30
20
125
5
 */


public class Simple_Calculator_Exercise2 {
    public static void main(String[] args){
        int num1 = 25;
        int num2 = 5;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;


        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(division);
    }
}
