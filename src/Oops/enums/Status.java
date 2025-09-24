package Oops.enums;

enum GetStatus{
    SUCCESS(200, "Operation successful"),
    ERROR(500, "Internal error"),
    NOT_FOUND(404, "Resource not found");

    private final int code;
    private final String message;

    // constructor (private by default)
    GetStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // getters
    public int getCode() { return code; }
    public String getMessage() { return message; }
}
public class Status {
    public static void main(String[] args) {
        GetStatus s = GetStatus.SUCCESS;
        System.out.println(s + " : " + s.getCode() + " - " + s.getMessage());
    }
}
