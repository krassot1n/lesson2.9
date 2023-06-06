package com.skypro.eshop.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Objects;
import java.util.Set;
@Component
@SessionScope
public class Basket {

    private final Set<Integer> items;

    public Basket(Set<Integer> items) {
        this.items = items;
    }

    public Set<Integer> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(items, basket.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "items=" + items +
                '}';
    }
}
