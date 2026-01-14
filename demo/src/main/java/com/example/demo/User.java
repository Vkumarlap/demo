package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
     private String name="kumar7569222";
     private int age;
    private int id;


     public String getName(){
        return name;
     }
     public void setName(String name){
        this.name=name;
     }


    public int getAge(){
        return age;
    } 
    public void setAge(int age){
        this.age=age;
    }

  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }

}
