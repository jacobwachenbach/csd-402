// Jacob Achenbach 4/13/2025

// Simple program that has a class Fan for speed, color, radius, and on/off state.


public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Parameterized constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            return "Fan is ON [Speed: " + speed + ", Color: " + color + ", Radius: " + radius + "]";
        } else {
            return "Fan is OFF [Color: " + color + ", Radius: " + radius + "]";
        }
    }

    // Test code
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.FAST, true, 10.5, "blue");

        System.out.println("Default Fan: " + defaultFan.toString());
        System.out.println("Custom Fan: " + customFan.toString());

        // Test setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setColor("black");
        defaultFan.setRadius(8.0);

        System.out.println("Modified Default Fan: " + defaultFan.toString());
    }
}
