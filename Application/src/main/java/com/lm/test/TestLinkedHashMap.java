package com.lm.test;

import java.util.LinkedHashMap;

/**
 * Created by 10528 on 2015/11/12.
 */
public class TestLinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<String,TestBean> linkedHashMap=new LinkedHashMap<>();
        for(int i=0;i<10;i++){
            linkedHashMap.put(""+i,new TestBean(i));
        }
        LinkedHashMap<String,TestBean> map=new LinkedHashMap<>(linkedHashMap);
        linkedHashMap.get("0").setI(60);
        map.get("1").setI(70);
        System.out.println("s");
    }
}
