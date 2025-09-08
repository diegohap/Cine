package com.cine.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class Service<T> {

    private List<T> t;

    protected Service(List<T> t) {
        this.t = t;
    }

    public List<T> getAll() {
        return t;
    }

    public void add(T t) {
        this.t.add(t);
    }

    public Boolean remove(T t) {
        return this.t.remove(t);
    }

    public T update(T oldElement, T newElement) {
        try {
            String oldUuid = (String) oldElement.getClass().getMethod("getUuid").invoke(oldElement);
            newElement.getClass().getMethod("setUuid", String.class).invoke(newElement, oldUuid);
            if (!remove(oldElement)) {
                throw new RuntimeException("Old element not found in the list");
            }
            add(newElement);

            return newElement;
        } catch (Exception e) {
            throw new RuntimeException("Error updating element", e);
        }
    }
//    public List<T> sortByComparator(Comparator<T> comparator){
//        t.sort(comparator);
//        return t;
//    }

    public List<T> findByAttributeName(String attributeName, Object attributeValue) {
        List<T> filteredItemList = new ArrayList<T>();
        try {
            for (T item : t) {
                String getterMethodName = "get" + attributeName.substring(0,1).toUpperCase() + attributeName.substring(1).toLowerCase();
                Object value = item.getClass().getMethod(getterMethodName).invoke(item);
                if(value.equals(attributeValue))
                    filteredItemList.add(item);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return filteredItemList;
    }

    @Override
    public String toString() {
        String s = "";
        for (T item : t) {
            s += item.getClass().getSimpleName() + ":\n";
            try {
                for (Field field : item.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    s += field.getName() + ": " + field.get(item) + "\n";
                }
            } catch (IllegalAccessException e) {
                s += "Error accessing fields: " + e.getMessage() + "\n";
            }
            s += "\n"; // separador entre elementos
        }
        return s;
    }
}
