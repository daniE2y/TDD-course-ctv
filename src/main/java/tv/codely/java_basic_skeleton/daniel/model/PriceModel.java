package tv.codely.java_basic_skeleton.daniel.model;

public class PriceModel {

    private String type;
    private Double amount;

    public PriceModel() {
    }

    public PriceModel(String type, Double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
