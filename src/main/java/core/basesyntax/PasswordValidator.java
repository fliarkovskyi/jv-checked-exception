package core.basesyntax;

public class PasswordValidator {
    public void validate (String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if(password.length() < 10 && repeatPassword.length() < 10){
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
