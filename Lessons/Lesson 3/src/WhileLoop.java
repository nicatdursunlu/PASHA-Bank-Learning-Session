public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop whileLoop = new WhileLoop();
//        whileLoop.simpleWhileLoop();
        whileLoop.infiniteWhileLoop();
    }

    public void simpleWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public void infiniteWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println("infinite");
        }
    }
}
