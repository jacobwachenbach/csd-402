// UseFans.java
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UseFans {

    // Display a single Fan without using toString()
    public static void displayFan(Fan f) {
        System.out.print("Fan is ");
        if (f.isOn()) {
            System.out.print("ON");
            System.out.print(" [Speed: "  + f.getSpeed()
                           + ", Color: " + f.getColor()
                           + ", Radius: " + f.getRadius()
                           + "]");
        } else {
            System.out.print("OFF");
            System.out.print(" [Color: " + f.getColor()
                           + ", Radius: " + f.getRadius()
                           + "]");
        }
        System.out.println();
    }

    // Display a collection of Fans
    public static void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {
        // Create a list of Fans
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan());                                 // default
        fans.add(new Fan(Fan.SLOW,  true, 5.5,  "red"));
        fans.add(new Fan(Fan.MEDIUM, false, 7.0,  "green"));
        fans.add(new Fan(Fan.FAST,   true, 12.0, "blue"));

        // Demo setters
        Fan custom = fans.get(0);
        custom.setOn(true);
        custom.setSpeed(Fan.MEDIUM);
        custom.setColor("black");
        custom.setRadius(8.0);

        // Display all
        System.out.println("=== Fan States ===");
        displayFans(fans);
    }
}
