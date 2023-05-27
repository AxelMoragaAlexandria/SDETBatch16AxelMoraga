package Class14;

public class E8 {
/*
Create a method that will take 2 parameters as a numbers and
 prints which number is larger.

 */
    void largeNum(int a,int b){
        if(a>b){
            System.out.println(a+ " is the larger number");
        }else{
            System.out.println(b+" is the larger number");
        }
    }

    public static void main(String[] args) {
                E8 obj=new E8();
                obj.largeNum(5,10);

    }



}
