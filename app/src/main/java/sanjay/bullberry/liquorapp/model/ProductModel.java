package sanjay.bullberry.liquorapp.model;

public class ProductModel {

    String image, url, productName, productPrice, address, date;


    public ProductModel(){

    }

    public ProductModel(String image, String url, String productName, String productPrice, String address, String date) {
        this.image = image;
        this.url = url;
        this.productName = productName;
        this.productPrice = productPrice;
        this.address = address;
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

