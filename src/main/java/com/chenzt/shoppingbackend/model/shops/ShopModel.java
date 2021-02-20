package com.chenzt.shoppingbackend.model.shops;

import com.chenzt.shoppingbackend.entity.Category;
import com.chenzt.shoppingbackend.entity.Shop;
import com.chenzt.shoppingbackend.entity.User;

public class ShopModel {
    private Shop shop;
    private User user;
    private Category category;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
