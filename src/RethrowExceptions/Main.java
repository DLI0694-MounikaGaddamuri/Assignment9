package RethrowExceptions;

public class Main {
    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();
        Transaction transaction = new Transaction(123,-100.0);
        try{
            processor.processTransaction(transaction);
        }catch(TransactionException e){
            System.err.println("Error occurred: "+e.getMessage());
        }
    }
}
