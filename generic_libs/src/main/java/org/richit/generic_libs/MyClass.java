package org.richit.generic_libs;

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


        endProgramme();
    }

}
