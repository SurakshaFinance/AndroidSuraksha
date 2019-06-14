package suraksha.in.suraksha.today_summarry;

public class TransactionHistory {

    private String transactionType;
    private String customerName;
    private String transactionTime;
    private String transactionAmount;

    public TransactionHistory(String transactionType, String customerName, String transactionTime, String transactionAmount) {
        this.transactionType = transactionType;
        this.customerName = customerName;
        this.transactionTime = transactionTime;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

}
