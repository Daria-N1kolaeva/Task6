package com.example.task3;

import java.util.HashMap;

public class ShapeFactory {
    private HashMap<Integer,Shape> collect  = new HashMap<Integer,Shape>();

    public Shape createShape(int numberOfSides) {
        collect.put(0,new Circle1(1,1,100));
        collect.put(3,new Triangle1(1,1));
        collect.put(4,new Rectangle1(1,1));
        return collect.get(numberOfSides);
        //    if (numberOfSides == 0) {
        //        return new Circle1(1, 1, 100);
        //    } else if (numberOfSides == 4) {
        //        return new Rectangle1(1, 1);
        //    }
        //    else if (numberOfSides == 3) {
        //        return new Triangle1(1,1);
        //    }


        //  return null;
    }
}
