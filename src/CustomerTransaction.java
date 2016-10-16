import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
    
    private List<Product> products;
    
    private Customer customer;
    
    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }
    
    @Override
    public String getName() {
        return "name";        
    }
    
    @Override
    public Date getDate() {
        return new Date();
    }
    
    @Override
    public String productBreakDown() {
        String reportList = null;
        for (Product product : products) {
            reportList += product.getProductName();
        }
        return reportList;
    }
    
    @Override
    public void chargeCustomer() {
        System.out.println("Charging customer...");
    }

    @Override
    public void prepareInvoice() {
        System.out.println("Invoice prepared...");
    }
}
