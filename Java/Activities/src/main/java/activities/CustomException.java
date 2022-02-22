    package activities;

public class CustomException extends Exception {
    private String message;

    public CustomException(String Exceptionmsg) {
        this.message = Exceptionmsg;
    }

    @Override
    public String getMessage() {
        return message;
    }
}