package prototype;

public class Client {
    private static void populateRegistryDummy(StudentRegistry studentRegistry) {
        Student dec23Prototype = new Student();
        dec23Prototype.setAvgBatchPsp(90.0);
        dec23Prototype.setBatchName("December 2023 Beginner");

        studentRegistry.register("dec23Beg", dec23Prototype);

        Student nov23Advance = new Student();
        nov23Advance.setAvgBatchPsp(95.0);
        nov23Advance.setBatchName("November 2023 Advance");

        studentRegistry.register("nov23Adv", nov23Advance);

        IntelligentStudent jan24IPrototype = new IntelligentStudent();
        jan24IPrototype.setAvgBatchPsp(99.0);
        jan24IPrototype.setBatchName("Jan 2024 Advance I");

        studentRegistry.register("jan2024AdvI", jan24IPrototype);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        populateRegistryDummy(studentRegistry);

        Student abdul = studentRegistry.get("dec23Beg").clone();
        abdul.setName("Abdul");
        abdul.setAge(21);
        abdul.setEmail("abdul@gmail.com");
        abdul.setPhone("123455");

        //abdul.saveToDB();

        Student nikhil = studentRegistry.get("nov23Adv").clone();
        nikhil.setName("nikhil");
        nikhil.setAge(21);
        nikhil.setEmail("nikhil@gmail.com");
        nikhil.setPhone("123455");
    }
}
