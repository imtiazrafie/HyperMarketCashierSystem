package hyperMarketSystems;

public class CustomerInformation 
{
    private String custID;
    private String custIC;
    private String custName;
    private String gender;
    private String address;
    private String counterPaid;
    
    //Relation with class ItemInformation
    private ItemInformation itemInformation;
    
   //Constructor without parameter
    public CustomerInformation()
    {
        this.itemInformation = null;
        this.custID = null;
        this.custIC= null;
        this.custName = null;
        this.gender = null;
        this.address = null;
        this.counterPaid = null;
    }
    
    //Normal Constructor
    public CustomerInformation(String custID, String custIC, String custName, String gender, String address, String counterPaid, 
    		                   String itemID, String itemName, double itemPrice, String datePurchase)
    {
        this.itemInformation = new ItemInformation(itemID, itemName, itemPrice, datePurchase, custID);
        this.custID = custID;
        this.custIC = custIC;
        this.custName = custName;
        this.gender = gender;
        this.address = address;
        this.counterPaid = counterPaid;
    }
    
    //Mutator/ Setter
    public void setCustID(String custID)
    {
        this.custID = custID;
    }
    
    public void setCustIC(String custIC)
    {
        this.custIC = custIC;
    }
    
    public void setCustName(String custName)
    {
        this.custName = custName;
    }
    
    public void setCustGender(String gender)
    {
        this.gender = gender;
    }
    
    public void setCustAddress(String address)
    {
        this.address = address;
    }
    
    public void setCounterPaid(String counterPaid)
    {
        this.counterPaid = counterPaid;
    }
    
    //Accessor/ Getter
    public String getCustID()
    {
        return custID;
    }
    
    public String getCustIC()
    {
        return custIC;
    }
    
    public String getCustName()
    {
        return custName;
    }
    
    public String getCustGender()
    {
        return gender;
    }
    
    public String getCustAddress()
    {
        return address;
    }
    
    public String getCounterPaid()
    {
        return counterPaid;
    }
    
    //Item method
    public String getItemID()
    {
        return itemInformation.getItemID();
    }
    
    public String getItemName()
    {
        return itemInformation.getItemName();
    }
    
    public double getitemPrice()
    {
        return itemInformation.getitemPrice();
    }
    
    public String getDatePurchase()
    {
        return itemInformation.getDatePurchase();  
    }
    
    //Printer
    public String toString()
    {
        return "Customer ID: " + custID + "\nCustomer name: " + custName + "\nGender: " + gender + "\nAddress: " + address +"\nCustomer IC: " + custIC + "\nCounter Paid: " + counterPaid + 
        "\nItem ID: " + getItemID() + "\nItem name: " + getItemName() + "\nPrice: " + getitemPrice() + "\nDate purchased: " + getDatePurchase();
    }
}