package javastream;

public class Product {
    private  int prodId;
    private String prodName;
    private int storeNumber;
    private String status = "stocked";
    private double price;

    public Product(int prodId, String prodName, int storeNumber, String status, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.storeNumber = storeNumber;
        this.status = status;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", storeNumber=" + storeNumber +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }
}
