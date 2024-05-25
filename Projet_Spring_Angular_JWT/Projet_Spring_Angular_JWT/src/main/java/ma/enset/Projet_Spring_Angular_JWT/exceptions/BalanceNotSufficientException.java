package ma.enset.Projet_Spring_Angular_JWT.exceptions;

public class BalanceNotSufficientException extends Exception {
    public BalanceNotSufficientException(String balanceNotSufficien) {
        super(balanceNotSufficien);
    }
}
