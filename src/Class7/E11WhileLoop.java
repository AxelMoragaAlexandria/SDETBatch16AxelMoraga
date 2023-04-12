package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {


        int i = 100;

        while (i >=1) {
            System.out.print(i+ " ");
            i -= 1;

        }
        // assigning a new value to the counter for next loop
        i=20;

        while(i<=100){
            System.out.print(i+ " ");
            i+=2;
        }


        i=100;
        // so that we can see the next output on a new line
        System.out.println();
        while(i>=1){
            //odd number when divided by 2 gives 1 as remainder
            if(i%2==1){
                System.out.print(i+" ");
            }
            i-=1;
        }

//remainder of 0 is even number
// remainder of 1 is odd number

    }
}
