package School;

public class Student extends Person {
        private double average;

        public Student(String name,int age , double average ){
            super(name , age);
            this.average = average;

        }

    public Student() {
        super();
    }

    public double getAverage() {
            return average;

        }

        public void setAverage(double rating) {
            this.average = average;
        }
        @Override
        public void work() {
            System.out.println( "Student");
        }
        @Override
        public String toString() {
            return "Student name" + getName() +
                    "Student age" + getAge() +
                    "Student average" + getAverage();
        }
    public void holiday(){
        System.out.println("Student have holidays");
    }
    }

