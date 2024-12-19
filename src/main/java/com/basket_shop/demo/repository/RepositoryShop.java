package com.basket_shop.demo.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.*;

@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class RepositoryShop {
    private final List<Integer> BAG = new ArrayList<>();

    public void add(List<Integer> id) {
        BAG.addAll(id);
    }

    public Collection<Integer> get() {
        return BAG;
    }
}
