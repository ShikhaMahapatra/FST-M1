package activities;

public class CustomExceptionActivity {
    public static void main(String[] args) {
        try {
            CustomExceptionActivity.exceptionTest("Will print to console");
            CustomExceptionActivity.exceptionTest(null);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
    private static void exceptionTest(String exception) throws CustomException {
        if (exception == null)
            throw new CustomException("String value is null");
        else
            System.out.println(exception.toString());
    }
}
