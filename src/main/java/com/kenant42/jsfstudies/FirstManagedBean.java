package com.kenant42.jsfstudies;

import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "fmb",eager = true)
public class FirstManagedBean {

    public String sayHello(){
        return "merhaba ".concat("dünya");
    }

}
