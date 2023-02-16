public class Package {
    private double pounds;
    private double length;
    private double height;
    private double width;

    Address origin = new Address("1313", "Mockingbird Lane", "Apt 6A", "Springfield", "MO", "65123");
    Address destination = new Address("1314", "Mockingbird Lane", "Springfield", "MO", "65129");

    public Package(double p, double l, double h, double w)
    {
        if (p > 0.1)
        {
            pounds = p;
        }
        if (l > 2)
        {
            length = l;
        }
        if (h > 2)
        {
            height = h;
        }
        if (w > 2)
        {
            width = w;
        }
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }
}
