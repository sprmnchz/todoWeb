package com.kindoz.todo.page.home.model;

import lombok.Data;

@Data
public class Step {

   private int id;
   private String name;
   private boolean finished;

   public Step(int id, String name) {

       this.id = id;
       this.name = name;
       this.finished = false;
   }

}
