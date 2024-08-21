package com.spring.boot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private int pid;
    private String pname;
    private int price;

    // If you prefer not to use Lombok, implement the getter methods like this:
    // public int getPid() {
    //     return pid;
    // }
    //
    // public String getPname() {
    //     return pname;
    // }
    //
    // public int getPrice() {
    //     return price;
    // }
}
