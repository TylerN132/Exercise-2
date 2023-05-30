public class InvoiceItem {
    private String itemCode;
    private String itemName;
    private double itemPrice;
    private static int itemCount = 0;

    public InvoiceItem(String itemCode, String itemName, double itemPrice) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        itemCount++;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public static int getItemCount() {
        return itemCount;
    }

    public void printCount() {
        System.out.println("Item count: " + itemCount);
    }

    @Override
    public String toString() {
        return "Item Code: " + itemCode +
                "\nItem Name: " + itemName +
                "\nItem Price: $" + itemPrice;
    }
}


