package com.javatraininghome1;

import com.google.common.collect.Multimap;
import com.google.common.collect.Range;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by xuzhongming on 2017/7/18.
 */

public class ActivityRule {
    //定义第一个map,存放外层键值
    private HashMap map=new HashMap();
    private Multimap multimap;
    private String value;
    public void ActivityRule(Multimap multimap,String value){
        this.multimap=multimap;
        this.value=value;
        map.put(multimap,value);
    }

    public void add(Multimap multimap,String value){
        map.put(multimap,value);
    }

    public HashMap getMap(){
        return map;
    }
}
