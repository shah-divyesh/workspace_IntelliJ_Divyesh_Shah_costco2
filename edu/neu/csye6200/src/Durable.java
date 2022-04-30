package neu.csye6200.src;

public class Durable extends  ItemAPI{
    double weight;
    String weightUnit;

    public Durable(){}

    public Durable(double weight, String weightUnit) {
        this.weight = weight;
        this.weightUnit = weightUnit;
    }

    public Durable(int itemID, double itemPrice, String itemCategory, String itemName, double weight, String weightUnit) {
        super(itemID, itemPrice, itemCategory, itemName);
        this.weight = weight;
        this.weightUnit = weightUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Override
    public String toString() {
        return "Durable{ " + super.toString()+
                ", weight=" + weight +
                ", weightUnit='" + weightUnit + '\'' +
                "} " ;
    }
}

