public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return this.id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerID(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return amount - ((getCustomerDiscount()/100.0) * amount);
    }
    public String toString(){
        return "Invoice[id="+getId()+",customer="+customer+",amount="+getAmountAfterDiscount()+"]";
    }
}
