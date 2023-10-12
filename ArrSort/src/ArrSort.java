import javax.swing.*;

public class ArrSort {
    public static int[] readArray(int n) {
        int[] arr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            String strInput = JOptionPane.showInputDialog("Enter a value: ");
            int value = Integer.parseInt(strInput);

            arr[idx] = value;
        }

        return arr;
    }

    public static int getArraySum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static double getArrayAvg(int[] arr) {
        int sum = getArraySum(arr);

        return (double) sum / arr.length;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to create an array?");
        int[] arr;

        if (option == JOptionPane.YES_OPTION) {
            String strInput = JOptionPane.showInputDialog("Please enter the array size: ");
            int iN = Integer.parseInt(strInput);
            arr = readArray(iN);
        } else {
            arr = new int[]{5, 7, 2, 9, 0, 1};
        }

        System.out.println("Sum of array is " + getArraySum(arr));
        System.out.println("Average of array is " + getArrayAvg(arr));
        bubbleSort(arr);
        printArr(arr);
    }
}