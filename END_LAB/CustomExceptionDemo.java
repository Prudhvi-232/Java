class CustomException extends Exception {
    String message;

    CustomException(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            e.printMessage();
        }
    }
}

