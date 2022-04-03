package com.dvimer.designpatterns.creational.factory.abstractfactory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("").getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks:");
        for (int i = 0; i < namedFactories.size(); i++) {
            Pair<String, HotDrinkFactory> item = namedFactories.get(i);
            System.out.println("" + i + " " + item.getValue0());
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i;
            int amount;
            if ((s = bufferedReader.readLine()) != null &&
                    (i = Integer.parseInt(s)) > 0 &&
                    i < namedFactories.size()) {

                System.out.println("Specify amount:");
                if ((s = bufferedReader.readLine()) != null &&
                        (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
