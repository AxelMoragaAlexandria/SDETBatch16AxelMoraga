package Class7;

public class E12WhileLoop {
    public static void main(String[] args) {
//first write a loop that goes from 1 to 10
        // create a variable to hold the sum and add all the numbers
        // to that variable in each iteration

        int i=1;
        int sum=0;

        while(i<=10){
            sum=sum+i; // same as sum+=i
            i+=1;

        }
        System.out.println(sum);







    }
}
