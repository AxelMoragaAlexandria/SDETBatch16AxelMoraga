package class21;

public class StudentTester {
    public static void main(String[] args) {

        Student[]student={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(Student stu:student){
                if(stu instanceof SyntaxStudent){
                    ((SyntaxStudent)stu).classesOn();
                }else if(stu instanceof SchoolStudent){
                    ((SchoolStudent)stu).homeWork();
                }else if(stu instanceof CollegeStudent ){
                    ((CollegeStudent)stu).dorm();
                }
            /*
            does stu contains contain the object of SyntaxStudent
            instanceOf checks which object is being stored in the variables
            If stu is instanceOf SyntaxStudent then perform the block of code
             */
                 stu.eat();
                 stu.isListening();
                 stu.isWriting();
        }


       /* Student stu=new SyntaxStudent();
        if(stu instanceof SchoolStudent){
            ((SyntaxStudent)stu).classesOn();
        }     else{
            System.out.println("Wrong type of object is present in syntax variable casting will fail");
        }




        Student stu2=new CollegeStudent();
        ((CollegeStudent)stu2).dorm();

              Student stu3=new SchoolStudent();
        ((SchoolStudent)stu3).homeWork();
*/




    }
}


