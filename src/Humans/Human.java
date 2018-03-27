package Humans;

import java.time.LocalDate;

public class Human {
    LocalDate birthday;
    String name;
    String nationality;
    double id;
    Human dad;
    Human mum;
    int height;
    int weight;

    /** Representation of a Human Being */
    Human (LocalDate birthday, String name, String nationality, Human dad, Human mum, int height, int weight) {
        this.birthday = birthday;
        this.name = name;
        this.nationality = nationality;
        // TODO: come up with a id generation algorithm.
        this.dad = dad;
        this.mum = mum;
        this.height = height;
        this.weight = weight;
    }
}
