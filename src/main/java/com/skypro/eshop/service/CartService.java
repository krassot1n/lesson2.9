package com.skypro.eshop.service;

import com.skypro.eshop.model.Basket;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.Set;

@Service
public class CartService {
    private final Basket basket;

    public CartService(Basket basket) {
        this.basket = basket;
    }

    public void add(Set<Integer> ids) {
        basket.getItems().addAll(ids);
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(basket.getItems());
    }


}
