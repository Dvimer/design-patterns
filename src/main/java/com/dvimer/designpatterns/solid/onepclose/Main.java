package com.dvimer.designpatterns.solid.onepclose;

import com.dvimer.designpatterns.solid.onepclose.filter.BetterFilter;
import com.dvimer.designpatterns.solid.onepclose.filter.ProductFilter;
import com.dvimer.designpatterns.solid.onepclose.model.Color;
import com.dvimer.designpatterns.solid.onepclose.model.Product;
import com.dvimer.designpatterns.solid.onepclose.model.Size;
import com.dvimer.designpatterns.solid.onepclose.specification.AndSpecification;
import com.dvimer.designpatterns.solid.onepclose.specification.ColorSpecification;
import com.dvimer.designpatterns.solid.onepclose.specification.SizeSpecification;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("tree", Color.GREEN, Size.LARGE);
        Product house = new Product("house", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green products(old):");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("\nGreen products(new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

        System.out.println("\nLarge blue products(new):");
        bf.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE)
        ))
                .forEach(p -> System.out.println(" - " + p.getName() + " is large blue"));

    }
}
