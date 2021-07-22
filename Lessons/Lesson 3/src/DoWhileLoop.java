public class DoWhileLoop {
    public static void main(String[] args) {
        DoWhileLoop doWhileLoop = new DoWhileLoop();
//        doWhileLoop.simpleExample();
        doWhileLoop.infiniteLoop();
    }

    public void simpleExample() {
        int i = 25;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    public void infiniteLoop() {
        do {
            System.out.println("infinite loop");
        } while (true);
    }
}
