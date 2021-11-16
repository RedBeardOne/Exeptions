package exeptions;

public class MyDomainExeption extends Exception{

    public MyDomainExeption() {
    }

    public MyDomainExeption(String message) {
        super(message);
    }

    public MyDomainExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDomainExeption(Throwable cause) {
        super(cause);
    }

    public MyDomainExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
