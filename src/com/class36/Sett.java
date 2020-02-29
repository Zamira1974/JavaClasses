package com.class36;

import java.util.HashSet;
import java.util.Set;

public class Sett {

    public static void main(String[] args) {
        //
        Set<String> sett=new HashSet<>();
        sett.add("Hatice");
        sett.add("Elif");
        sett.add("Manana");
        sett.add("Fadime");
        
        //sett.get(2);  //not based on index
        //sett.add(1,"Nurcan");
        sett.add("Nurcan");
        sett.add("Fadime");
        System.out.println(sett);
    }
}