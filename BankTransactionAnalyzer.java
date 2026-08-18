import java.util.ArrayList;

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class BankTransactionAnalyzer {

    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("CREDIT", 5000));
        transactions.add(new Transaction("DEBIT", 1200));
        transactions.add(new Transaction("CREDIT", 3000));
        transactions.add(new Transaction("DEBIT", 800));

        double totalCredit = transactions.stream()
                .filter(t -> t.type.equals("CREDIT"))
                .mapToDouble(t -> t.amount)
                .sum();

        double totalDebit = transactions.stream()
                .filter(t -> t.type.equals("DEBIT"))
                .mapToDouble(t -> t.amount)
                .sum();

        System.out.println("===== TRANSACTION ANALYSIS =====");
        System.out.printf("Total Credit : ₹%.2f%n", totalCredit);
        System.out.printf("Total Debit  : ₹%.2f%n", totalDebit);
        System.out.printf(
                "Net Balance  : ₹%.2f%n",
                totalCredit - totalDebit
        );
    }
}
