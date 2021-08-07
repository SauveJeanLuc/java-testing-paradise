package com.testing.paradise.Set;

import java.util.Collections;
import com.testing.paradise.Set.IteratorTest;

public class IteratorTestMain {

    //TODO: Test with many values of Role

    public static void main(String[] args) {
        IteratorTest iterator = new IteratorTest();
        Role role = new Role(ERole.SERIALIZED, "Great");
        iterator.setRoles(Collections.singleton(role));
        System.out.println(iterator.getRoles().iterator().next().getName());
    }


}
