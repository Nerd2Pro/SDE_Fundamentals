/**
 * Calculator
 */
public class Calculator {
    public static void main(String[] args) {
        int num1, num2, result = 0;
        String operation = args[0];
        num1 = Integer.parseInt(args[1]);
        num2 = Integer.parseInt(args[2]);

        if(operation.equals("add"))
            result = num1 + num2;
        if(operation.equals("sub"))
            result = num1 - num2;
        if(operation.equals("mul"))
            result = num1 * num2;
        if(operation.equals("div"))
            result = num1 / num2;

        System.out.println(result);

    }
    
}