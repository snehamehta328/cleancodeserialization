import java.io.IOException;
public class interest {
    double amount, rate, t, simple,compound;
    public void simpleInterest() throws IOException {
        simple = (amount * t * rate)/100;
        System.out.write(("Simple Interest is :\n"+simple).getBytes());
    }
    public void compoundInterest() throws IOException {
        compound = amount * Math.pow(1.0+rate/100.0,t) - amount;
        System.out.write(("Compund Interest is :"+compound).getBytes());
    }
}
