package com.zipcodewilmington.person;

public class PersonBuilder {
    private Integer id;
    private String favoriteColor;
    private Boolean alive;
    private String name;
    private Integer age;

    public PersonBuilder(){

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
        return this;
    }

    public PersonBuilder setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }
    public Person build(){
        return new Person(id, favoriteColor, alive, name, age);

    }
}
