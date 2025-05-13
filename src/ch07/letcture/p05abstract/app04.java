package ch07.letcture.p05abstract;

import ch06.sec13.exam02.package1.A;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Objects;

public class app04 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        AbstractList b = a;
        AbstractCollection c = a;
        Object d = a;
        
    }
}
