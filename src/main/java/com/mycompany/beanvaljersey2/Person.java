package com.mycompany.beanvaljersey2;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    String naam;

    @NotNull
    Integer age;

    public Person() {
    }

    public Person(String naam, Integer age) {
        this.naam = naam;
        this.age = age;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "naam=" + naam + ", age=" + age + '}';
    }

}
