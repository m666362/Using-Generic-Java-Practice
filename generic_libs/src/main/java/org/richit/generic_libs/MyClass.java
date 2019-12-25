package org.richit.generic_libs;

import java.util.ArrayList;

public class MyClass {

    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }


    public static void main(String[] args) {

        startProgramme();
        ArrayList<String> strings = new ArrayList<>();
        strings.add( "Zero" );
        strings.add( "One" );
        strings.add( "Two" );
        strings.add( "Three" );
        strings.add( "Four" );
        strings.add( "Five" );

        System.out.println(strings.get( 2 ));

        endProgramme();
    }

}
