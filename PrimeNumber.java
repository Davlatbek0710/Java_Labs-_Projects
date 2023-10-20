import java.io.IOException;

public class PrimeNumber extends IOException {
    private String message;
    public PrimeNumber(String message){
        super(message);
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
