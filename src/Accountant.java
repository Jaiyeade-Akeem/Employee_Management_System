public class Accountant extends Staff{
    public Accountant(String firstName, String lastName, String sex, int age, int contact, int id, int salaryAmount, int accountNumber) {
        super(firstName, lastName, sex, age, contact, id, salaryAmount, accountNumber);
    }

    @Override
    public void applyLeave() {
        System.out.println("Accountant " + this.getLastName() + "you have successfully applied for 2 months annual leave.");
    }
    public void paySalary (Ceo ceoSalary, Accountant accountantSalary, Manager managerSalary, Worker workerSalary ){
        System.out.println("Ceo " + ceoSalary.getLastName() + " has been paid the salary of " + ceoSalary.getSalaryAmount() + " for this month");
        System.out.println("Accountant " + accountantSalary.getLastName() + " has been paid the salary of " + accountantSalary.getSalaryAmount() + " for this month");
        System.out.println("Manager " + managerSalary.getLastName() + " has been paid the salary of " + managerSalary.getSalaryAmount() + " for this month");
        System.out.println("Worker " + workerSalary.getLastName() + " has been paid the salary of " + workerSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Ceo ceoSalary, Accountant accountantSalary, Manager managerSalary) {
        System.out.println("Ceo " + ceoSalary.getLastName() + " has been paid the salary of " + ceoSalary.getSalaryAmount() + " for this month");
        System.out.println("Accountant " + accountantSalary.getLastName() + " has been paid the salary of " + accountantSalary.getSalaryAmount() + " for this month");
        System.out.println("Manager " + managerSalary.getLastName() + " has been paid the salary of " + managerSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Ceo ceoSalary, Accountant accountantSalary ) {
        System.out.println("Ceo " + ceoSalary.getLastName() + " has been paid the salary of " + ceoSalary.getSalaryAmount() + " for this month");
        System.out.println("Accountant " + accountantSalary.getLastName() + " has been paid the salary of " + accountantSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Ceo ceoSalary) {
        System.out.println("Ceo " + ceoSalary.getLastName() + " has been paid the salary of " + ceoSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Accountant accountantSalary) {
        System.out.println("Accountant " + accountantSalary.getLastName() + " has been paid the salary of " + accountantSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Manager managerSalary) {
        System.out.println("Manager " + managerSalary.getLastName() + " has been paid the salary of " + managerSalary.getSalaryAmount() + " for this month");
    }
    public void paySalary (Worker workerSalary) {
        System.out.println("Worker "+ workerSalary.getLastName() + " has been paid the salary of " + workerSalary.getSalaryAmount() + " for this month");
    }


}
