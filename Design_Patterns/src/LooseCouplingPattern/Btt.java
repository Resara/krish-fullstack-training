package LooseCouplingPattern;

public class Btt extends Handler{

    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getAmmount() + invoice.getAmmount()*0.03);
        System.out.println("BTT calculated");
        if (invoice.getAmmount()<=200.0 && invoice.getAmmount()<=300.0){
            return invoice.getTax();
        }else{
            return successor.applyTax(invoice);
        }
    }
}
