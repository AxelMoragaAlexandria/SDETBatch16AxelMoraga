package class21;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {

    void isWriting(){
        System.out.println("Student is writing");
    }
    void isListening(){
        System.out.println("Student is listening");
    }
    void eat(){
        System.out.println("Student is eating during break time");
    }




}

class SyntaxStudent extends Student{
        @Override
        void isWriting(){
            System.out.println("Is writing code");
        }
        @Override
        void isListening(){
            System.out.println("Is hearing concepts from Java");
        }

        void classesOn(){
            System.out.println("Syntax Student classes are only online");
        }

}

class CollegeStudent extends Student{
        @Override
        void isWriting(){
            System.out.println("Is writing an essay");
        }
        @Override
        void isListening(){
            System.out.println("Is hearing lectures from Instructor");
        }

        void dorm(){
            System.out.println("Student has a dorm where he can sleep and study");
        }

}

class SchoolStudent extends Student{
        @Override
        void isWriting(){
            System.out.println("Is writing a task");
        }
        @Override
        void isListening(){
            System.out.println("Is hearing Homework from Teacher");
        }

        void homeWork(){
            System.out.println("Student goes home and do the homework ");
        }
}







