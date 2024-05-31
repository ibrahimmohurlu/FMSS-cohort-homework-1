package residence;

public class Residence {
    private int area;
    private int price;
    private int roomCount;
    private int loungeCount;

    @Override
    public String toString() {
        return "Residence{" +
                "area=" + area +
                ", price=" + price +
                ", roomCount=" + roomCount +
                ", loungeCount=" + loungeCount +
                '}';
    }

    public Residence(int price, int area, int roomCount, int loungeCount) {
        this.area = area;
        this.price = price;
        this.roomCount = roomCount;
        this.loungeCount = loungeCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLoungeCount() {
        return loungeCount;
    }

    public void setLoungeCount(int loungeCount) {
        this.loungeCount = loungeCount;
    }


    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
