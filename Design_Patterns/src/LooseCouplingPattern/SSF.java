package LooseCouplingPattern;

public class SSF extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getAmmount() + invoice.getAmmount()*0.04);
        System.out.println("SSF calculated");
        return invoice.getTax();

    }
}
