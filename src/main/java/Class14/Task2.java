package Class14;

public class Task2 {

    boolean isPalindromeSB(String str){
/*
new StringBuilder(str)==> converts string to a StringBuilder
reverse()==> reverses the contents in StringBuilder
.toString()==> converts the Stringbuilder back to a String
.equalsIgnoreCase(str);==> comparing the reversed String to original one
 */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
