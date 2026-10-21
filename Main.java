// src/Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 2;

        List<Operation> operations = List.of(
            new Addition(),
            new Subtraction(),
            new Multiplication(),
            new Division()
        );

        System.out.println("Running Calculator Tests:");
        for (Operation op : operations) {
            System.out.println(op.getName() + ": " + op.calculate(num1, num2));
        }
    }
}

