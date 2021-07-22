public class Arrays {
    public static void main(String[] args) {

        char[] charArray;
        charArray = new char[5];

//        int[] intArray = new int[5];

//        int[] intArray = {1, 2, 3, 4, 5};
//        System.out.println(intArray[4]);
//        System.out.println(intArray[2]);

        int[][] unequalDimensions = new int[3][];
        unequalDimensions[0] = new int[3];
        unequalDimensions[1] = new int[2];
        unequalDimensions[2] = new int[1];

        System.out.println(unequalDimensions[0]);
    }
}
