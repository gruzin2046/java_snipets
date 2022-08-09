package java_snippets._1_14_Basics;

public class _11_MultiDimArrays {
    public static void main(String[] args) {
        // simple initiation
        double[][] myTable = {{1.0, 1.5, 2.0}, {1.5, 2.0, 2.5}, {2.0, 2.5, 3.0}};

        for (int i = 0; i < myTable.length; i++) {
            for (int j = 0; j < myTable[0].length; j++) {
                System.out.println(myTable[i][j] + " value have position " + j + " in table " + i);
            }
        }

        // we can also initiate empty arrays for objects:
        String[][] stringArr = new String[3][3]; // all values are null
        System.out.println(stringArr[2][2]); //prints: null

        int[][] intArray = new int[3][3]; // all values are 0
        System.out.println(intArray[2][2]); //prints: 0
        // System.out.println(intArray[4][2]); //error: ArrayIndexOutOfBoundsException

        int[][] intArray2 = new int[3][];
        //System.out.println(intArray2[2][2]); //error: NullPointerException
    }
}
