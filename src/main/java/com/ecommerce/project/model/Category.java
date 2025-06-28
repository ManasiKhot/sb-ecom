package com.ecommerce.project.model;

public class Category {
    private Long categoryID;
    private String categoryName;

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public void setCategoryId(Long categoryId) {
        this.categoryID = categoryId;
    }


    public Object getCategoryId() {
        return categoryID;
    }
}
