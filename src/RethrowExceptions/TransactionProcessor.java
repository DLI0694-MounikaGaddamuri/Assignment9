package RethrowExceptions;

public class TransactionProcessor {
    public void processTransaction(Transaction transaction) throws TransactionException{
        try{
            performTransaction(transaction);
        }catch(Exception e){
            String contextMessage="Failed to process transaction with ID: "+transaction.getId();

            throw new TransactionException(contextMessage,e);
        }
    }
    private void performTransaction(Transaction transaction) throws Exception{
        if(transaction.getAmount()<0){
            throw new Exception("Negative transaction");
        }
    }
}
