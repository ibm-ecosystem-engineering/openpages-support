package com.ibm.openpages.support.models;

public class ObjectType implements IObjectType {
    private final String name;

    public ObjectType(String name) {
        this.name = name;
    }

    public static ObjectType from(String name) {
        return new ObjectType(name);
    }

    public String name() {
        return name;
    }
}
