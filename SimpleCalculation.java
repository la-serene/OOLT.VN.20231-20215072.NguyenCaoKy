import javax.swing.JOptionPane;

public class SimpleCalculation {
    public static void main(String[] args) {
        String strNum1;
        String strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Input the first number", "Input the first number",
                JOptionPane.QUESTION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Input the second number", "Input the second number",
                JOptionPane.QUESTION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = Math.abs(num1 - num2);
        double prod = num1 * num2;
        int res1 = Double.valueOf(num1 / num2).intValue();
        int res2 = Double.valueOf(num2 / num1).intValue();
        double quo1 = num1 - num2 * res1;
        double quo2 = num2 - num1 * res2;

        JOptionPane.showMessageDialog(null,
                "Sum: " + sum);
        JOptionPane.showMessageDialog(null,
                "Difference: " + diff);
        JOptionPane.showMessageDialog(null,
                "Product: " + prod);
        JOptionPane.showMessageDialog(null,
                "Quotient of num1 by num2: " + quo1);
        JOptionPane.showMessageDialog(null,
                "Quotient of num2 by num1: " + quo2);
        System.exit(0);
    }
}
