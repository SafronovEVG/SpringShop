package com.basket_shop.demo.service.impl;

import com.basket_shop.demo.repository.RepositoryShop;
import com.basket_shop.demo.service.api.ShopService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    private final RepositoryShop repositoryShop;

    public ShopServiceImpl(RepositoryShop repositoryShop) {
        this.repositoryShop = repositoryShop;
    }

    @Override
    public void addItem(List<Integer> Id) {
        repositoryShop.add(Id);
    }

    @Override
    public Collection<Integer> getItems() {
        return repositoryShop.get();
    }
}
