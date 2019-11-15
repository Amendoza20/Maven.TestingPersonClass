package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {

    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        PersonBuilder builder = new PersonBuilder();
        // When
        builder.setName(expectedName);
        builder.setAge(expectedAge);
        Person person =  builder.build();
        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";
        PersonBuilder builder = new PersonBuilder();
        // When
        builder.setName(expected);
        Person person =  builder.build();

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;
        PersonBuilder builder = new PersonBuilder();
        // When
        builder.setAge(expected);
        Person person =  builder.build();

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        PersonBuilder builder = new PersonBuilder();
        // When
        builder.setName(expectedName);
        builder.setAge(expectedAge);
        Person person =  builder.build();

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        String expected = "Leon";

        PersonBuilder builder = new PersonBuilder().setName(expected);

        // When
        Person person = builder.build();
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        PersonBuilder builder = new PersonBuilder();

        Integer expected = 5;

        // When
        builder.setAge(expected);
        Person person = builder.build();
        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
