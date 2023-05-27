package Class25;

public class Student {

    String name;
    String id;
    int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String toString(){
        return name+id+age;
    }

}
