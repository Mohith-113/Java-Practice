class Student{
    String name;
    int age;
    long number;
    String rollNumber;
}

public class ArrayDynamic {
    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Mohith";
        s1.age = 20;
        s1.number = 7418529630L;
        s1.rollNumber = "218T1A0567";

        Student s2 = new Student();
        s2.name = "Mourya";
        s2.age = 21;
        s2.number = 7418529631L;
        s2.rollNumber = "218T1A0568";

        Student s3 = new Student();
        s3.name = "Rakesh";
        s3.age = 20;
        s3.number = 7418529632L;
        s3.rollNumber = "218T1A05B0";

        Student s4 = new Student();
        s4.name = "Dhanush";
        s4.age = 21;
        s4.number = 7418529633L;
        s4.rollNumber = "218T1A05B8";


        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;


        System.out.println("Name      RollNumber   Age   Phone Number");

        // for(int i = 0; i<students.length; i++){
        //     System.out.println(students[i].name + "    " + students[i].rollNumber + "    " + students[i].age + "    " + students[i].number);
        // }
        


        for (Student student : students) {
            System.out.println(student.name + "    " + student.rollNumber + "    " + student.age + "    " + student.number);
        }
        
    }
    
}
