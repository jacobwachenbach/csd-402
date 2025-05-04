public abstract class Division {
    protected String divisionName;
    protected String accountNumber;

    // Constructor that needs division name and account number
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
