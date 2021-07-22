public class BreakStatement {
    public static void main(String[] args) {
        BreakStatement breakStatement = new BreakStatement();
//        breakStatement.simpleExample();
        breakStatement.nestedLoopExample();
    }

        public void simpleExample() {
            for (int i = 1; i < 10; i++) {
                if(i % 5 == 0) {
                    System.out.println("i can be divided by 5, exit loop");
                    break;
                }
                System.out.println(i);
            }
        }

    public void nestedLoopExample() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if(j == 15) {
                    System.out.println("j can be divided to 15, exit loop");
                    break;
                }
                System.out.println("i = " + i + " j = " + j);
            }
            if (i == 5) {
                System.out.println("i can be divided to 5, exit loop");
                break;
            }
        }
    }

    public void labeledForLoop() {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
                if (j == 3) {
                    break outerLoop;
                }
            }
        }
        System.out.println("Outer loop iterations are over");
    }

    public void breakWhileLoop() {
        int i = 1;
        while (true) {
            if (i % 10 == 0) {
                System.out.println("i is divisible by 10, exit loop");
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
