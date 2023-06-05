package com.weather.weatheer.model;
import java.util.UUID;
public class Person {
    private final UUID id;
    private final String name;
    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
    public UUID getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
}
