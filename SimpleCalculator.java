import java.util.Scanner; // add Scanner

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number"); // get 1 number from user
        double num1 = scanner.nextDouble();
        System.out.println("Enter 2 number"); //get 2 number from user
        double num2 = scanner.nextDouble();

        System.out.println("Enter action"); //get action from user
        String action = scanner.next();

        double result; //var for result
        switch (action) { // switch for describing what to do depend on what action user are choose
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (num2 != 0) { // exception on case when user try to device on zero
                result = num1 / num2;
                System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: cannot be divided by zero");
                }
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("!!!Error in incoming data!!!"); // exception on case when user type invalid action
        }

    }
}
