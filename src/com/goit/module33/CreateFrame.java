package com.goit.module33;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 27.03.2016.
 */
public class CreateFrame {
    Object[] headers = {"Instrument", "NameOfInstrument"};

    Object [][] data = {
            {"Guitar", "Bass"},
            {"Guitar", "Acoustic"},
            {"Guitar", "Hard"},
            {"Piano", "Crown"},
            {"Piano", "Appolo"},
            {"Piano", "Bach"},


    };
    JTable JTabMusicalInstruments;

    CreateFrame(){
        JFrame jfrm = new JFrame( "CreateFrame" );
        jfrm.getContentPane().setLayout( new FlowLayout(  ) );
        jfrm.setSize( 300,170 );
        jfrm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        JTabMusicalInstruments  = new JTable( data, headers );
        JScrollPane jscrlp = new JScrollPane( JTabMusicalInstruments );
        JTabMusicalInstruments.setPreferredScrollableViewportSize( new Dimension( 250, 100 ) );
        jfrm.getContentPane().add( jscrlp );
        jfrm.setVisible( true );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
                new CreateFrame();
            }
        } );
    }


}
