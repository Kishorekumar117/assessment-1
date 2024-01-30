package ShopingCart;

public class Product {
    private String pName;
    private double pBasePrice;
    private int pQuantity;

    public Product(String pName, double pBasePrice, int pQuantity) {
        this.pName = pName;
        this.pBasePrice = pBasePrice;
        this.pQuantity = pQuantity;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpBasePrice() {
        return pBasePrice;
    }

    public void setpBasePrice(double pBasePrice) {
        this.pBasePrice = pBasePrice;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public double getTotalPrice() {
        return pBasePrice * pQuantity;
    }
}
