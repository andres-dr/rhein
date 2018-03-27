package Humans;

import History.History;

import java.time.LocalDate;
import java.util.Random;

public class Human {
    LocalDate birthday;
    String name;
    String nationality;
    long id;
    Human dad;
    Human mum;
    int height;
    int weight;

    static Random rand = new Random();

    /** Representation of a Human Being */
    Human (LocalDate birthday, String name, String nationality, Human dad, Human mum, int height, int weight) {
        this.birthday = birthday;
        this.name = name;
        this.nationality = nationality;
        // TODO: come up with a id generation algorithm.
        this.id = generateId();
        this.dad = dad;
        this.mum = mum;
        this.height = height;
        this.weight = weight;
    }

    static long generateId() {
        long id = 0;
        long multiplier = 1;
        for (int digit = 0; digit < 12; digit++) {
            id += rand.nextInt(10) * multiplier;
            multiplier *= 10;
        }
        if (!History.humans.contains(id)) {
            History.humans.add(id);
        } else {
            generateId();
        }
        return id;
    }
}
