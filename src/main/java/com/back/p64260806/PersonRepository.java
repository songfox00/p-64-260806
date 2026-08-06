package com.back.p64260806;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonRepository {

    private final int version;

    public int count() {

        System.out.println("version = " + version);
        return 3;
    }

}
