package com.goit.module33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 08.03.2016.
 */
public class Piano extends MusicalInstrument {
    private String name;
    private int year;

    public Piano(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Piano{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
