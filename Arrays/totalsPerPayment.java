// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static class Transaction{
        String type;
        double amount;
        Transaction(String type,double amount){
            this.type=type;
            this.amount=amount;
        }
    }
    static Map<String,Double> getTotalsByPaymentType(List<Transaction> transactions){
        Map<String,Double> res=new HashMap();
        for(Transaction txn : transactions){
            res.put(txn.type,res.getOrDefault(txn.type,0.0)+txn.amount);
        }
        return res;
    }
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("UPI",300),
            new Transaction("Credit",300),
            new Transaction("Debit",300),
            new Transaction("Credit",300),
            new Transaction("Wallet",300)
            );
        Map<String,Double> result = getTotalsByPaymentType(transactions);
        System.out.println(result);
    }
}
