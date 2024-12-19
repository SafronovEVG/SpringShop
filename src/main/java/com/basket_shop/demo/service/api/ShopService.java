package com.basket_shop.demo.service.api;

import java.util.Collection;
import java.util.List;

public interface ShopService {

    void addItem(List<Integer> Id);

    Collection<Integer> getItems();
}
