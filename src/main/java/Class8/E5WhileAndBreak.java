package Class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

       /*create a boolean variable summer, store true in it
      then write a loop that runs as long as it is summer. Create a temp variable
      store 85 and inside the loop check the temperature if it is less than 100
      print "it's good, I enjoy summer" as soon temperature exceeds 100 print
      "it's very hot" and break the loop with break keyword
        */


        boolean summer=true;
        int temp=85;
        while(summer){
            if(temp<100){
                System.out.println("It's good, I enjoy summer");
            }else{
                System.out.println("it's very hot");
                break;
            }


            temp=temp+2;


            }



        }



    }

