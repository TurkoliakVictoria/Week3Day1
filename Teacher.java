package School;

public class Teacher  extends Person {
    private String degree;
    private String subject;

    public Teacher(String name, int age,String subject, String degree) {
        super(name, age);
        this.subject = subject;
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    @Override
    public void work() {
        System.out.println("Teacher");
    }

    @Override
    public String toString() {
        return "Teacher - name" + getName() +
                "Teacher - age" + getAge() +
                "Teachers subject -" + getSubject() +
                "Teachers degree -" + getDegree();


    }
    public void holiday(){
        System.out.println("Teacher does not have holidays");}
}
