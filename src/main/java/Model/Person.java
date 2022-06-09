package Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person extends Identifier {
    private String name;
    private String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return
                "Ad='" + name + '\'' +
                ", Soyad='" + surName + '\'' +
                '}';
    }
}