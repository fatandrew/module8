package com.goit.module33;

import java.util.Comparator;

/**
 * Created by User on 27.03.2016.
 */
public class FileComparator implements Comparator <Guitar> {
    @Override
    public int compare(Guitar o1, Guitar o2) {
        return o1.getYear() - o2.getYear();
    }
}
