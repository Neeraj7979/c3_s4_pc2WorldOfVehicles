package com.main;

import com.data.IcEngine;
import com.data.sub.Diesel;

public class EngineImpl {
    public static void main(String[] args) {
        Engine e1=new Engine("Ep502","Manual","1250cc",200);
        IcEngine ic1=new IcEngine("Mzh026","Automatic","1200cc",220,4, "Diesel");
    }
}
