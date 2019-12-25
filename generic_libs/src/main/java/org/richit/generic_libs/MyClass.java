package org.richit.generic_libs;

import java.util.ArrayList;
import java.util.HashMap;

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
        HashMap<Integer, String> hashMaps = new HashMap<>();
        hashMaps.put( 80, "Monjura" );
        hashMaps.put( 60, "Jamal" );
        hashMaps.put( 50, "Momena" );
        hashMaps.put( 25, "Rayhan" );
        hashMaps.put( 22, "Marjana" );
        hashMaps.put( 17, "Farhan" );
        hashMaps.put( 13, "Jihan" );
        System.out.println(hashMaps);
        System.out.println(hashMaps.values());
        System.out.println(hashMaps.get( 25 ));
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
