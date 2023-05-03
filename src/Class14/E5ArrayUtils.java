package Class14;

public class E5ArrayUtils {

    /*
    Create a method call it contains it should take an array of int and and an
    int number in the method body it should search the array for that number
    if number is present in the array method should return true otherwise should
    return false in a seperare class call the mehtod and test it for below
     */
// return type++> boolean
// name of method=>contains
// parameters==> int[]arr,int num
    boolean contains(int[]arr, int num) {
        boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
                break;
            }
        }
            return isFound;
    }

}
