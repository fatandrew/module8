package com.goit.module33;

import java.util.*;

/**
 * Created by User on 27.03.2016.
 */
public class TreeSetList {
    public static void main(String[] args) {
        List<Guitar> guitars = new ArrayList<>();
        guitars.add( new Guitar( "Bass", 1755 ) );
        guitars.add( new Guitar( "Acoustic", 1955 ) );
        guitars.add( new Guitar( "Hard", 13355 ) );
        guitars.add( new Guitar( "Rock", 1755 ) );

        SortedSet<String> stringSet = new TreeSet<String>(  );
        stringSet.add( "ddd" );
        stringSet.add( "ddd" );
        stringSet.add( "ddd" );
        stringSet.add( "ddd" );

    }

}
