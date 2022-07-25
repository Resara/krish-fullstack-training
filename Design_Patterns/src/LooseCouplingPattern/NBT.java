package LooseCouplingPattern;

public class NBT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getAmmount() + invoice.getAmmount()*0.02);
        System.out.println("NBT calculated");
        if (invoice.getAmmount()<=100.0 && invoice.getAmmount()<=200.0){
            return invoice.getTax();
        }else{
            return successor.applyTax(invoice);
        }
    }
}
