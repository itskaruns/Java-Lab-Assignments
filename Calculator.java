import java.util.Scanner;
public class Calculator{
        public int num1, num2;

        public int sum(int n1, int n2){
            return n1 + n2;
        }

        public int difference(int n1, int n2){
            return n1 - n2;
        }

        public int product(int n1, int n2){
            return (n1 * n2);
        }

        public float divide(float n1, int n2){
            return n1 / n2;
        }
        public int mod(int n1, int n2){
            return n1 % n2;
        }

    public static void main(String[] args){
        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        c.num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        c.num2 = scan.nextInt();
        int ch;
        do{
            System.out.println("What would you like to do?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\nchoice:");
            ch = scan.nextInt();
            switch (ch){
                case 1:
                    int sum = c.sum(c.num1, c.num2);
                    System.out.println("The sum is: " + sum);
                    break;
                case 2:
                    int diff = c.difference(c.num1, c.num2);
                    System.out.println("The difference is: " + diff);
                    break;
                case 3:
                    int prod = c.product(c.num1, c.num2);
                    System.out.println("The products is: " + prod);
                    break;
                case 4:
                    float div = c.divide(c.num1, c.num2);
                    System.out.println("the quotient is: " + div);
                    break;
                case 5:
                    int mod = c.mod(c.num1, c.num2);
                    System.out.println("the modulus is: " + mod);
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
            System.out.println("Would you like to continue?\n1: Yes\n2: No");
            ch = scan.nextInt();
        } while(ch != 2);
        scan.close();
    }
}