package RethrowExceptions;

public class Transaction {
    private int id;
    private double amount;
    public Transaction(int id,double amount){
        this.id=id;
        this.amount=amount;
    }
    public int getId(){
        return id;
    }
    public double getAmount(){
        return amount;
    }
}
