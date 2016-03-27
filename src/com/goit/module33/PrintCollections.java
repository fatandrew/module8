package com.goit.module33;

import com.sun.javafx.binding.StringFormatter;

import javax.sound.midi.Instrument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 24.03.2016.
 */
public class PrintCollections {
    public static void main(String[] args) {
        List<Guitar> guitars = new ArrayList<>();
        guitars.add( new Guitar( "Bass", 1755 ) );
        guitars.add( new Guitar( "Acoustic", 1955 ) );
        guitars.add( new Guitar( "Hard", 13355 ) );
        guitars.add( new Guitar( "Rock", 1755 ) );



    List<Piano> pianos = new ArrayList<>();
        pianos.add( new Piano( "Crown", 1333 ) );
        pianos.add( new Piano( "Kingsbury", 1733 ) );
        pianos.add( new Piano( "Appolo", 1633 ) );
        pianos.add( new Piano( "Bach", 1633 ) );
        System.out.println(pianos);

        FileComparator comparator = new FileComparator();
        Collections.sort(guitars, comparator );
        System.out.println(guitars);
}
    }



