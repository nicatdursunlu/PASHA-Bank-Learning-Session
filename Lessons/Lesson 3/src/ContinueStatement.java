public class ContinueStatement {
    public static void main(String[] args) {
        ContinueStatement continueStatement = new ContinueStatement();
//        continueStatement.forLoop();
//        continueStatement.whileLoop();
        continueStatement.labeledForLoop();
    }

    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }

    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
    }

    public void labeledForLoop() {
        loop1:
        for(int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 3 == 0) {
                    continue loop1;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
