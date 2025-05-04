public class DomesticDivision extends Division {
    private String state;

    // Constructor that needs division name, account number, and state
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement the display method
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
