package payment;
public class order {
    String name, type, sugar;
    int qty;

    public order(String name, String type, String sugar, int qty) {
        this.name = name;
        this.type = type;
        this.sugar = sugar;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSugar() {
        return sugar;
    }

    public int getQty() {
        return qty;
    }
    
    
}
