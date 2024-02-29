public class oopsIntro {
    public static void main(String[] args) {
       Student student1 = new Student();

//        student1.roll = 10;
//        student1.name = "ahsan";
//        student1.marks = 98.50f;
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student student = new Student(2, "John Doe", 88.0f);

//        student1.changeName("zeya");
//        student1.greeting();
//

    }
    static class  Student{
        int roll;
        String name;
        float marks;
        void  greeting(){
            System.out.println("hello how are you " + this.name);
        }
        void  changeName(String newName){
            name = newName;
        }
        Student (){
            this.marks = 98.45f;
            this.roll =1;
            this.name = "ashan shams";
        }
        Student (int rollnumber, String nameStudent, float marksStudent){
            this.marks = marksStudent;
            this.roll = rollnumber;
            this.name = nameStudent;
        }
    }
}
