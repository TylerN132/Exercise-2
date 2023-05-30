public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    private static int invoiceCount = 0;

public InvoiceItem(String id, String desc, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.unitPrice = unitPrice;
    this.invoiceCount ++;
}

public InvoiceItem(InvoiceItem cpy) {
    this.id = cpy.id;
    this.desc = cpy.desc;
    this.qty = cpy.qty;
    this.unitPrice = cpy.unitPrice;
    this.invoiceCount ++;
}


public String getID() {
    return id;
}

public String getDesc() {
    return desc;
}

public int getQTY() {
     return qty;
}

public void setQTY(int qty) {
     this.qty = qty;
}

public double getUnitPrice() {
    return unitPrice;
}

public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
}

public double getTotal() {
    double Total = unitPrice * qty;
    return Total;
}

public String toString() {
    return ("InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]");
}

public void PrintCount() {
    System.out.println("Invoice Count = " + this.invoiceCount);
}

}
