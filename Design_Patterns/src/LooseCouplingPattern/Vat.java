package LooseCouplingPattern;

public class Vat extends Handler{
    @Override
    public double applyTax(Invoice invoice) {

        invoice.setTax(invoice.getAmmount() + invoice.getAmmount()*0.01);
        System.out.println("Vat Calculated");
        if (invoice.getAmmount()<=100){
            return invoice.getTax();
        }else{
            return successor.applyTax(invoice);
        }

    }
}
