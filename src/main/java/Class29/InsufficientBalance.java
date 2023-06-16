package Class29;

/***
 * This exception is thrown when there is no enough balance in the users account and he tries
 * to withdraw the money
 */
public class InsufficientBalance extends RuntimeException {

    InsufficientBalance(String errorMsg){
        super(errorMsg);
    }
}
