public class Applicant extends Personnel{
    public Applicant(String firstName, String lastName, String sex, int age, int contact, int id) {
        super(firstName, lastName, sex, age, contact, id);
    }
    public void apply() {
        System.out.println("hello applicant " + this.getFirstName() + " you have successfully applied. We would get in touch soon..");
    }
}
