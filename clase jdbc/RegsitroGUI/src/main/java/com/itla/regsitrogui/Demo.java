/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.regsitrogui;

import com.itla.regsitrogui.test.Calculable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 57781
 */
public class Demo {

    public static void main(String[] args) {

        List<String> list = new ArrayList();

        list.add("juan");
        list.add("jose");
        list.add("Pedro");
        list.add("Rafael");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Calculable calculable = new Calculable() {

            @Override
            public int calcular(int num1, int num2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };

        Map<String, String> map = new HashMap<>();

        map.put("R", "RED");
        map.put("B", "BLUE");
        map.put("Y", "YELLOW");
        map.put("G", "GREEN");

        Set<String> KeySet = map.keySet();
        Collection<String> value = map.values();
        Set<Map.Entry<String,String>> entrySet= map.entrySet();
        

        List<String> valuesList = new ArrayList(value);
        
        System.out.println(map.get("R"));
        System.out.println(KeySet);
        System.out.println(valuesList);
        
        for(Map.Entry<String,String> entry: entrySet){
            
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

    class CalculadoraTest implements Calculable {

        @Override
        public int calcular(int num1, int num2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
