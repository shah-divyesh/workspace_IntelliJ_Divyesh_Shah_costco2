package neu.csye6200.src;

public class ItemAPI {
    private int itemID;
    private double itemPrice;
    private String itemDescription;
    private String itemName;

    public ItemAPI() {
    }



    public ItemAPI(int itemID, double itemPrice, String itemDescription, String itemName) {
        this.itemID = itemID;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "ItemAPI{" +
                " itemID=" + itemID +
                ", itemPrice=" + itemPrice +
                ", itemCategory='" + itemDescription + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
