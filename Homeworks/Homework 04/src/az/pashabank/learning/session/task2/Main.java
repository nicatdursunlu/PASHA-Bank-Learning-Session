package az.pashabank.learning.session.task2;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(3, "medium", 10, 15);
        System.out.println(room.toString());
        System.out.println("Ares is " + room.calculateArea());
        room.showNumberOfRooms();

    }
}
