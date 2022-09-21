abstract class Personnel {
    private String firstName;
    private String lastName;
    private String sex;
    private int Age;
    private int contact;
    private int id;

    public Personnel(String firstName, String lastName, String sex, int age, int contact, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        Age = age;
        this.contact = contact;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return Age;
    }

    public int getContact() {
        return contact;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setId(int id) {
        this.id = id;
    }
}
