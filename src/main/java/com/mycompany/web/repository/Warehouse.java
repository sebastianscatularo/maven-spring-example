package com.mycompany.web.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
@Scope(value = "singleton")
public class Warehouse<T> {
    private int index = 0;
    private Map<Integer, T> elements = new HashMap<Integer, T>();

    public void add(T t) {
        if(t != null) {
            elements.put(index, t);
            index++;
        }
    }

    public Map<Integer, T> getElements() {
        return elements;
    }

    public void remove(Integer id) {
        if(elements.containsKey(id)) {
            elements.remove(id);
        }
    }
}
