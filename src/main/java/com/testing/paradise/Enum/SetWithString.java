package com.testing.paradise.Enum;

import com.testing.paradise.Set.ERole;

public class SetWithString {

    public static void main(String[] args) {
        Instance example = new Instance();

        System.out.println(ERole.valueOf("SAUVE"));
    }
}

class Instance{
    ERole role;

    public void setRole(ERole role) {
        this.role = role;
    }
}
