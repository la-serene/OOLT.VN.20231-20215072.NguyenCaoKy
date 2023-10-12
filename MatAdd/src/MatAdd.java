import javax.swing.JOptionPane;

public class MatAdd {
    public static int[][] readMatrix(int row, int col) {
        int[][] mat = new int[row][col];

        for (int nRow = 0; nRow < row; nRow++) {
            for (int nCol = 0; nCol < col; nCol++) {
                String strInput = JOptionPane.showInputDialog("Enter a value: ");
                int value = Integer.parseInt(strInput);
                mat[nRow][nCol] = value;
            }
        }

        return mat;
    }

    public static int[][] addMatrix(int[][] mat1, int[][] mat2) {
        int row = mat1.length;
        int col = mat1[0].length;

        for (int nRow = 0; nRow < row; nRow++) {
            for (int nCol = 0; nCol < col; nCol++) {
                mat1[nRow][nCol] += mat2[nRow][nCol];
            }
        }

        return mat1;
    }
    
    public static void printMatrix(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to create a new matrix?");
        int[][] mat1;
        int[][] mat2;

        if (option == JOptionPane.YES_OPTION) {
            String strInput = JOptionPane.showInputDialog("Please enter the matrix row: ");
            int iRow = Integer.parseInt(strInput);
            strInput = JOptionPane.showInputDialog("Please enter the matrix column: ");
            int iCol = Integer.parseInt(strInput);

            mat1 = readMatrix(iRow, iCol);
            mat2 = readMatrix(iRow, iCol);
        } else {
            mat1 = new int[][]{{5, 7, 2, 9, 0, 1},
                    {2, 3, 4, 5, 6, 7}};
            mat2 = new int[][]{{1, 6, 2, 5, 8, 2},
                    {0, 7, 1, 2, 8, 1}};
        }

        int[][] mat = addMatrix(mat1, mat2);
        printMatrix(mat);
    }
}