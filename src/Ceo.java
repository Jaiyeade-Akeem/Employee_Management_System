public class Ceo extends Staff{
    public Ceo(String firstName, String lastName, String sex, int age, int contact, int id, int salaryAmount, int accountNumber) {
        super(firstName, lastName, sex, age, contact, id, salaryAmount, accountNumber);
    }

    @Override
    public void applyLeave() {
        System.out.println("Ceo " + this.getLastName() + "you have successfully applied for 6 months annual leave.");
    }

}
