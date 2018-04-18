import java.rmi.RemoteException;

public class Account {

    private String code;
    private String client;
    private double amount;

    public Account(String code, String client, double amount) {
        this.code = code;
        this.client = client;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
