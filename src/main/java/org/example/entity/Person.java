package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Person {
   private String userName;
   private String userLogin;
   private long salary;
}