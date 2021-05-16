package com.company;

import org.junit.Test;

import org.junit.Assert;
import static org.junit.Assert.*;

public class PersonTest {
    private Person person=new Person("john",-5);
    int expectedvalue;
    String expectedname;
    String expectedreverse;
    String actualname;
    int actualvalue;
    String actualreverse;

    @Test
    public void getName() {
        System.out.println("getname");
        expectedname="john";
        actualname=person.getName();
        Assert.assertEquals(actualname,expectedname);


    }

    @Test
    public void getAge() {
        expectedvalue=0;
        actualvalue=person.getAge();
        Assert.assertEquals(expectedvalue,actualvalue);

    }

    @Test
    public void setName() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void reversename() {
        expectedreverse="nhoj";
        actualreverse=person.reversename("john");
        Assert.assertEquals(expectedreverse,actualreverse);
    }
}