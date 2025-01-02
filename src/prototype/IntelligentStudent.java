package prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public Student clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setAge(this.getAge());
//        intelligentStudent.setEmail(this.getEmail());
//        intelligentStudent.setPhone(this.getPhone());
//        intelligentStudent.setBatchName(this.getBatchName());
//        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
//
//        intelligentStudent.iq = this.iq;
//
//        return intelligentStudent;

        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
