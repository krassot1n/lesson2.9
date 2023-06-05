package com.skypro.eshop.controller;

import com.skypro.eshop.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> items) {
        cartService.add(items);

    }

    @GetMapping("/get")
    public Collection<Integer> get(@RequestParam("ID") Set<Integer> items) {
        return cartService.get();

    }


}
