public class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
        mySubject = "None";
        mySalary = 0.0;
    }

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;
    }
}
