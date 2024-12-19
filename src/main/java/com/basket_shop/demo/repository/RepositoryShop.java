package com.basket_shop.demo.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@SessionScope
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
