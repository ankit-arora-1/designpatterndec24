package prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String phone;
    private String email;
    private String batchName;
    private double avgBatchPsp;
    private int count = 1;

    public Student() {

    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.email = student.email;
        this.phone = student.phone;
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.count = student.count;
    }

    @Override
    public Student clone() {
//        Student student = new Student();
//        student.name = this.name;
//        student.age = this.age;
//        student.phone = this.phone;
//        student.email = this.email;
//        student.batchName = this.batchName;
//        student.avgBatchPsp = this.avgBatchPsp;
//        student.count = this.count;
//
//        return student;

        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        count++;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
}
