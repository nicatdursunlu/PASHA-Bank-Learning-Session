package az.pashabank.learning.session.task2;

public class Room extends Building {

    private String type;
    private double width;
    private double height;

    static int numberOfRooms;

    public Room() {}

    public Room(int numberOfRooms, String type, int width, int height) {
        this.numberOfRooms = numberOfRooms;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Number: " + numberOfRooms + ", type: " + type + ", width: " + width + ", height: " + height;
    }

    public double calculateArea() {
        return width * height;
    }

    static void showNumberOfRooms() {
        System.out.println("Number of rooms: " + numberOfRooms);
    }
}

