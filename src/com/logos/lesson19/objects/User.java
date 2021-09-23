package com.logos.lesson19.objects;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    private Long id;
    private String name;

    private transient Passport passport;
}
