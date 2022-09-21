public class Main {
    public static void main(String[] args) {
        Applicant applicant = new Applicant("ab","nd","male",20,345,111);
        Ceo ceo1 = new Ceo("cole","ashley","male",45,8056,222,25000,22536);
        Manager manager1 = new Manager("abu","anifah","male", 33, 334,221,12000,8879);
        Accountant accountant1 = new Accountant("bello","turji","male",37,998,55,13000,53691);
        Worker worker1 = new Worker("salah","moh","female",21,111,12,3500,232);
        System.out.println(applicant.getFirstName());
        applicant.apply();
        System.out.println(ceo1.getContact());
        System.out.println(worker1.getSalaryAmount());
        //accountant1.paySalary(accountant1);
        accountant1.paySalary(ceo1,accountant1,manager1,worker1);
        worker1.applyLeave();
    }
}