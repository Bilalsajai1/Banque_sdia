package ma.enset.Projet_Spring_Angular_JWT.exceptions;

public class CustomerException extends Exception {
    public CustomerException(String customerNotFound) {
        super(customerNotFound);
    }
}
