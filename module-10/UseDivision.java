// Jacob Achenbach 5/4/2025

// Is a fake company's divisions and displays details like division name, account number, and specific attributes for international and domestic divisions.

public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        InternationalDivision intDivision1 = new InternationalDivision("International Sales", "INT-123", "Canada", "French");
        InternationalDivision intDivision2 = new InternationalDivision("International Marketing", "INT-456", "Germany", "German");
        
        DomesticDivision domDivision1 = new DomesticDivision("East Coast Sales", "DOM-789", "New York");
        DomesticDivision domDivision2 = new DomesticDivision("West Coast Marketing", "DOM-101", "California");

        // Displaying the details of each division
        intDivision1.display();
        intDivision2.display();
        domDivision1.display();
        domDivision2.display();
    }
}
