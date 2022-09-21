public class Staff extends Personnel{
    private int salaryAmount;
    private int accountNumber;
    public Staff(String firstName, String lastName, String sex, int age, int contact, int id, int salaryAmount, int accountNumber) {
        super(firstName, lastName, sex, age, contact, id);
        this.salaryAmount = salaryAmount;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void applyLeave(){
        System.out.println("hello " + this.getLastName() + "you have successfully applied for your annual leave.");
    }
}
