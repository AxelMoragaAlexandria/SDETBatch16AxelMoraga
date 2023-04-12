package Homework;

public class Class6HW5 {
    public static void main(String[] args) {

            // quiz+midTerm+Final/3 gets average
            int  quiz=85;
            int midTerm=87;
            int Final=98;
            int average=(quiz+midTerm+Final)/3;

            if(average>=90){
                System.out.println("grade=A");
            }else if(average>=70 && average<90){
                System.out.println("grade=B");
            }else if(average>=50 && average<=70){
                System.out.println("grade=C");
            }else if (average<50){
                System.out.println("grade=F");
            }

























    }
}
