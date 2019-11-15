package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private Integer id;
    private String favoriteColor;
    private Boolean alive;
    private String name;
    private Integer age;

    public Person(Integer id, String favoriteColor, Boolean alive, String name, Integer age) {
             this.id = id;
             this.favoriteColor = favoriteColor;
             this.alive = alive;
             this.name = name;
             this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public Boolean getAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}



