public class Exercises {

    public static void main(String[] args) {
        Exercises exercises = new Exercises();

//        int[] intArray = {3, 4, 7, 8};
//        exercises.exercise1(intArray);

//        int[] arr = {34, 25, 65, 78, 2, 10};
//        exercises.exercise2(arr);

        exercises.exercise3(5);
    }

    public void exercise1(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.println("Sum of integers is " + sum);

        double average = sum / (double) arr.length;
        System.out.println("Average of integers is " + average);
    }

    public void exercise2(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public void exercise3(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
