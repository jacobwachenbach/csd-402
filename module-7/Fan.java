// Jacob Achenbach 4/20/2025

// Simple program that has a class Fan for speed, color, radius, and on/off state in a collection of Fan instances.

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor
    public Fan() {
        this.speed  = STOPPED;
        this.on     = false;
        this.radius = 6.0;
        this.color  = "white";
    }

    // Parameterized constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed  = speed;
        this.on     = on;
        this.radius = radius;
        this.color  = color;
    }

    // Getters
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
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

    // toString uses this. too
    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON  [Speed: "  + this.speed
                              + ", Color: " + this.color
                              + ", Radius: " + this.radius
                              + "]";
        } else {
            return "Fan is OFF [Color: "  + this.color
                              + ", Radius: " + this.radius
                              + "]";
        }
    }
}
