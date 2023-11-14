package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyGenericApp
{
    public static void main(String[] args){

        //Com Generics
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        int total = 0;
        for(Integer i : lista){
            total += i;
        }

        System.out.println(total);

    }

}

