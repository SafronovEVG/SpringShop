package com.basket_shop.demo.cotroller;

import com.basket_shop.demo.service.api.ShopService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam List<Integer> id) {
        shopService.addItem(id);
    }

    @GetMapping("/get")
    public Collection<Integer> getItems() {
        return shopService.getItems();
    }
}
