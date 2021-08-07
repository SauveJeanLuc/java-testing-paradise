package com.testing.paradise.Set;

import lombok.Data;

@Data
public class Role {
    private ERole name;
    private String description;

    public Role(ERole name, String description) {
        this.name = name;
        this.description = description;
    }
}
