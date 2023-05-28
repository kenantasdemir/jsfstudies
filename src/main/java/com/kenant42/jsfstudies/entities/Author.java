package com.kenant42.jsfstudies.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private int id;
    private String name;
    private int age;
    private String bookName;

}
