package com.goit.module33;

import java.util.*;

/**
 * Created by User on 08.03.2016.
 */
public class Guitar extends MusicalInstrument

{

    private String name;
    private int year;
    public Guitar(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
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
        return "Guitar{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
