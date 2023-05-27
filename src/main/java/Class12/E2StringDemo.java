package Class12;

public class E2StringDemo {
    public static void main(String[] args) {


        String userName = "admin";
        String passWord = "pass123";
    /*write the code to check the username and password if
     the username and password are less than 8 characters
    Signup succesfully otherwise print usernname can't
    be more than 8 characters
     */


        if (userName.length()<8 && passWord.length()<8){
            System.out.println("Signup successful");
        }else{
            System.out.println("Username and password can't be more than 8 characters");
        }


    }
}
