package org.patterns;

import java.util.HashMap;

public class PrototypeRegistry {
    private HashMap<String, Prototype> components;

    public PrototypeRegistry() {
        components = new HashMap<String, Prototype>();
    }

    public void addItem(String id, Prototype item) {
        components.put(id, item);
    }

    public Prototype getById(String id) {
        return components.get(id).clone();

    }

}
