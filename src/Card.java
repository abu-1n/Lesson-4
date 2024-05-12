import java.util.Random;
import java.util.concurrent.Callable;

public class Card implements Callable<String> {
    private String number;
    private String expireDate;
    private Double balance;
    Random random =new Random();

    public Card() {
    }

    public Card(String number, String expireDate, Double balance) {
        this.number = number;
        this.expireDate = expireDate;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public String call() throws Exception {
        System.out.println("request send to endpoint of bank...");
        System.out.println(number+" checking... ");
        Thread.sleep(100);
        boolean b = number!=null && (!number.isBlank()) && random.nextBoolean();

        return b?"everything is ok":"wrong data provided!";
    }
}
