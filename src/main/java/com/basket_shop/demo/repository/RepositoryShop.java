package com.basket_shop.demo.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class RepositoryShop {
    private final Collection<Integer> BAG = new HashSet<>();

    public void add(List<Integer> id) {
        BAG.addAll(id);
    }

    public Collection<Integer> get() {
        return BAG;
    }
}
