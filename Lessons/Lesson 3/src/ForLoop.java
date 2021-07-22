public class ForLoop {
    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();
//        forLoop.simpleExample();
//        forLoop.forLoopOnArray();
//        forLoop.nestedLoop();
//        forLoop.forEachExample();
        forLoop.labeledForLoop();
    }

    public void simpleExample() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    public void forLoopOnArray() {
        int[] arr = {2, 4, 6, 8, 10};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void nestedLoop() {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }

    public void forEachExample() {
        int[] arr = {2, 4, 6, 8, 10};
        for (int i: arr) {
            System.out.println(i);
        }
    }

    public void labeledForLoop() {
        loop1:
        for (int i = 0; i < 5; i++) {
            loop2:
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
