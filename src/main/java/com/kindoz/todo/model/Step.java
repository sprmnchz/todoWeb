package com.kindoz.todo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Step {

    private String name;
    private boolean finished;
    private Step parentStep;
    @Setter(AccessLevel.PRIVATE)
    private List<Step> childrenStepList;


    public Step() {
        this.name = "root";
        this.finished = false;
    }

    public Step(String name) {
       this.name = name;
       this.finished = false;
   }

    public Step(String name, Step parentStep) {
        this.name = name;
        this.finished = false;
        this.parentStep = parentStep;
    }

    public void addChildrenStep (Step childrenStep) {

        if (this.childrenStepList == null) {
            this.childrenStepList = new ArrayList<>();
        } else {
            this.childrenStepList.add(childrenStep);
        }

    }

    public Step getChildrenStep (int index) {
        return childrenStepList.get(index);
    }



}
