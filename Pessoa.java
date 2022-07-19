public class Pessoa {

    public static boolean emailValid(String email) {
        boolean isValid = false;
        if (email.indexOf('@') > 0 && email.length() <= 50) {
            isValid = true;
        }
        return isValid;
    }
}
