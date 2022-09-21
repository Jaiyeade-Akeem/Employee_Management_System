public class Worker extends Staff{
    public Worker(String firstName, String lastName, String sex, int age, int contact, int id, int salaryAmount, int accountNumber) {
        super(firstName, lastName, sex, age, contact, id, salaryAmount, accountNumber);
    }

    @Override
    public void applyLeave() {
        System.out.println("Worker " + this.getLastName() + "you have successfully applied for 2 weeks annual leave.");
    }
}
