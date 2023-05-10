package Class19;

public class Math {

   static void add(int a, int b){
        System.out.println(a+b);
    }
      static void add(int a, int b,int c){
        System.out.println(a+b);
    }
    static void add(int a, double b){
        System.out.println(a+b);
    }
    static void add(double b, int a){
        System.out.println(a+b);
    }
    static void add(long a, long b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }
    static void add(double a, double b, int c){
        System.out.println(a+b+c);
    }


//we must have different 1)number of parameters 2)data types of parameters 3)sequence of dataTypeshmenon

    public static void main(String[] args) {
        add(10,10);
       add(5,5.5);
       add(2.4,4.4);
       add(555555L,44444L);
       add(10.5,20);



    }

}
