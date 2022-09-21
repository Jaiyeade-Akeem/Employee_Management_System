public class Manager extends Staff{
    public Manager(String firstName, String lastName, String sex, int age, int contact, int id, int salaryAmount, int accountNumber) {
        super(firstName, lastName, sex, age, contact, id, salaryAmount, accountNumber);
    }

    @Override
    public void applyLeave() {
        System.out.println("Manager " + this.getLastName() + "you have successfully applied for 3 months annual leave.");
    }
}
