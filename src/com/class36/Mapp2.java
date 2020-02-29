package com.class36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapp2 {
	public static void main(String[] args) {
        Map<String, String> fadimeInfo=new HashMap<>();
        fadimeInfo.put("ID","007");
        fadimeInfo.put("Salary","120000");
        fadimeInfo.put("Job_T","SDET");
        
        Set<String> keys=fadimeInfo.keySet();
//      for(int i=0;) {//standard for loop i++
//          }
        for(String key:keys) {
            System.out.println(key);
        }
        
        System.out.println(fadimeInfo.get("ID"));
        
        Collection<String> values=fadimeInfo.values();
        
        
        for(String value:values) {
            System.out.println(value);
        }
        Iterator<String> it=values.iterator();
        while(it.hasNext()) {
            String its=it.next();       
        }
    
        
      
        Map<String, String> MananaInfo=new HashMap<>();
        MananaInfo.put("ID","005");
        MananaInfo.put("Salary","130000");
        MananaInfo.put("Job_T","SDET");
        
        List<Map<String,String>>listOfemp=new ArrayList<>();
        listOfemp.add(fadimeInfo);
        listOfemp.add(MananaInfo);
    }
}

