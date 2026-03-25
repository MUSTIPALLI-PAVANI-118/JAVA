package report;

import account.Account;

public class Report {

    public void generateReport(Account acc) {
        System.out.println("\n--- ACCOUNT REPORT ---");
        acc.displayAccount();
    }
}


