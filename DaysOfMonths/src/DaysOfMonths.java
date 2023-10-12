import javax.swing.*;

public class DaysOfMonths {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        String strMonth = JOptionPane.showInputDialog("Please enter the month: ");
        String strYear = JOptionPane.showInputDialog("Please enter the year: ");

        String[][] months = {
                {"1", "Jan", "Jan.", "January"},
                {"2", "Feb", "Feb.", "February"},
                {"3", "Mar", "Mar.", "March"},
                {"4", "Apr", "Apr.", "April"},
                {"5", "May", "May.", "May"},
                {"6", "Jun", "Jun.", "June"},
                {"7", "Jul", "Jul.", "July"},
                {"8", "Aug", "Aug.", "August"},
                {"9", "Sep", "Sep.", "September"},
                {"10", "Oct", "Oct.", "October"},
                {"11", "Nov", "Nov.", "November"},
                {"12", "Dec", "Dec.", "December"}
        };

        int iYear = Integer.parseInt(strYear);
        boolean stop = false;

        Integer[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int mon = 0; mon < months.length; mon++) {
            for (int idx = 0; idx < 4; idx++) {
                if (strMonth.equals(months[mon][idx])) {
                    if (strMonth.equals("2") && isLeapYear(iYear)) {
                        System.out.println(29);
                    } else {
                        System.out.println(days[mon]);
                    }
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }

    }
}