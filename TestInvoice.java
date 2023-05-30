public class TestInvoice {
    

    public static void main(String[] args) {

       

        InvoiceItem PeanutButter = new InvoiceItem("PB", "Peanut Butter", 1.10);
        PeanutButter.PrintCount();
        System.out.println(PeanutButter);
        System.out.println(" ");
        
        InvoiceItem Flour = new InvoiceItem("White Bread", "White Bread", 2.50);
        Flour.PrintCount();
        System.out.println(Flour);
        System.out.println(" ");
        
        InvoiceItem PlayStation = new InvoiceItem("ps5", "PlayStation 5", 599.00);
        Playstation.PrintCount();
        System.out.println(Playstation);
        System.out.println(" ");
        
        InvoiceItem Cookies = new InvoiceItem("CC111", "Chocolate Chip Cookies", 4.75);
        Cookies.PrintCount();
        System.out.println(Cookies);
        System.out.println(" ");
        
        InvoiceItem Ruffels = new InvoiceItem("AD", "All Dressed Chips", 3.49);
        Ruffels.PrintCount();
        System.out.println(Ruffels);
        System.out.println(" ");
        
        InvoiceItem Spiderman2 = new InvoiceItem("SP2", "Spider-man 2", 100.00);
       Spiderman2.PrintCount();
        System.out.println(Spiderman2);

     
        

    }
}
