package LooseCouplingPattern;

public class Invoice {

    private int invoiceNumber;
    private double ammount;
    private double tax;

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public Invoice(int invoiceNumber, double ammount) {
        this.invoiceNumber = invoiceNumber;
        this.ammount = ammount;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmmount() {
        return ammount;
    }

    public double getTax() {
        return tax;
    }
}
