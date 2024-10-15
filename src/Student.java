
interface Printable {
    void print();
}


public class Student implements Printable {
    private String name;
    private String recordBookNumber;
    private double averageGrade;

    public Student(String name, String recordBookNumber, double averageGrade) {
        this.name = name;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = averageGrade;
    }


    public String getName() {
        return name;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecordBookNumber(String recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ", Record Book Number: " + recordBookNumber + ", Average Grade: " + averageGrade);
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "RB12345", 4.5);
        student.print();
    }
}

