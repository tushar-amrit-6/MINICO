package com.example.recyclerview;
public class service {
    private String Title;
    private String Category;
    private String Description;
    private String SellerName;
    private String  price;
    private String phone;
    private int thumbnail;

    public service() {
    }

    public service(String title, String category, String description, String sellerName, String price, String phone, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        SellerName = sellerName;
        this.price = price;
        this.phone = phone;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return price;
    }

    public String getPhone() {
        return phone;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}

