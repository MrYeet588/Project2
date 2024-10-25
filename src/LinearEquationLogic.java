import java.util.Scanner;

public class LinearEquationLogic {
    int x1;
    int y1;
    int x2;
    int y2;
    private Scanner scanner;
    private LinearEquation equation;
    String firstCord;
    String secondCord;


    public LinearEquationLogic() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome User!");
        getCoordinates();
        if (x1 == x2) {
            System.out.println("These points are on vertical line: x = " + x1 + "\nThe slope is invalid.");
        } else {
            ask4X();
        }
    }

    private void getCoordinates() {
        System.out.print("Enter first coordinate (x1, y1): ");
        firstCord = scanner.nextLine();
        System.out.print("Enter second coordinate (x2, y2): ");
        secondCord = scanner.nextLine();


        x1 = Integer.parseInt(firstCord.substring(firstCord.indexOf("(") + 1, firstCord.indexOf(",")));
        y1 = Integer.parseInt(firstCord.substring(firstCord.indexOf(",") + 2, firstCord.indexOf(")")));
        x2 = Integer.parseInt(secondCord.substring(secondCord.indexOf("(") + 1, secondCord.indexOf(",")));
        y2 = Integer.parseInt(secondCord.substring(secondCord.indexOf(",") + 2, secondCord.indexOf(")")));
    }


    private void ask4X() {
        equation = new LinearEquation(x1, y1, x2, y2);


        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();


        System.out.print("Enter a value for x: ");
        double xValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("The point on the line is: ");
        System.out.println(equation.coordinateForX(xValue));
        loop();
    }

    private void loop() {
        System.out.print("Would you like to enter another pair of coordinates? (y/n): ");
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals("y")) {
            getCoordinates();
            ask4X();
        }
        if (yesOrNo.equals("n")) {
            System.out.println("Thanks for using, CYA!");
        }
    }
}