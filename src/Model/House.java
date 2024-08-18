package Model;

public class House {
    private double price;
    private double squareMeters;
    private int rooms;
    private int livingRooms;

    public House(double price, double squareMeters, int rooms, int livingRooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }
}
