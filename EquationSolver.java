import javax.swing.JOptionPane;

public class EquationSolver {
    public static double[] readCoEfficient(int n) {
        String msg = "Please input a value: ";
        double[] coefficients = new double[n];

        for (int i = 0; i < n; i++) {
            String strInput = JOptionPane.showInputDialog(msg);
            coefficients[i] = Integer.parseInt(strInput);
        }

        return coefficients;
    }

    public static double solveFirstDegreeEqOneVar() {
        double[] coefficient = readCoEfficient(3);
        
        String eq = coefficient[0] + "x + " + coefficient[1] + " = " + coefficient[2];
        System.out.println(eq);

        double solution = 0.0;
        
        if (coefficient[0] != 0) {
            solution = (coefficient[2] - coefficient[1]) / coefficient[0];
            System.out.println("Solution: x = " + solution);
        } else {
            if (coefficient[1] == coefficient[2]) {
                System.out.println("The equation has countless solution");
            } else {
                System.out.println("The equation has no solution");
            }
        }
        
        return solution;
    }

    public static double[] solveFirstDegreeEqSystemTwoVars() {
        double[] coefficient = readCoEfficient(6);

        String eq = coefficient[0] + "x + " + coefficient[1] + " = " + coefficient[2] + "\n"
                + coefficient[3] + "x + " + coefficient[4] + " = " + coefficient[5];
        System.out.println(eq);

        double determinant = coefficient[0] * coefficient[4] - coefficient[3] * coefficient[1];
        double x = (coefficient[2] * coefficient[4] - coefficient[5] * coefficient[1]) / determinant;
        double y = (coefficient[0] * coefficient[5] - coefficient[3] * coefficient[2]) / determinant;
        
        System.out.println("Solution: x = " + x + "; y = " + y);
        
        return new double[]{x, y};
    }
    
    public static double solveSecondDegreeEqOneVar() {
        double[] coefficient = readCoEfficient(4);

        String eq = coefficient[0] + "x^2 + " + coefficient[1] + "x + " + coefficient[2] + " = " + coefficient[3];
        System.out.println(eq);

        double discriminant = coefficient[1] * coefficient[1] - 4 * coefficient[0] * coefficient[2];

        if (discriminant >= 0) {
            double sqrtDiscriminant = Math.sqrt(discriminant);

            double root1 = (-coefficient[1] + sqrtDiscriminant) / (2 * coefficient[0]);
            double root2 = (-coefficient[1] - sqrtDiscriminant) / (2 * coefficient[0]);

            if (root1 == root2) {
                System.out.println("Solution: x = " + root1);
                return root1;
            } else {
                System.out.println("Solution: x = " + root2);
                return root2;
            }
        }

        return -1.0;
    }

    public static void main(String[] args) {
        String menu =
                """
                =============MENU============
                1. First-degree equation with one variable
                2. System of first-degree equations with two variables
                3. Second-degree equation with one variable
                Please choose an option!
                """;
        String option = JOptionPane.showInputDialog(menu);

        switch (option) {
            case "1" -> solveFirstDegreeEqOneVar();
            case "2" -> solveFirstDegreeEqSystemTwoVars();
            case "3" -> solveSecondDegreeEqOneVar();
            default -> {
            }
        }
    }
}
