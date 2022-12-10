package com.kindoz.todo.page.home.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Goal {

    private int lastIdStep;
    private ArrayList<Step> target = new ArrayList<>();

    public void addStep(Step step) {
        target.add(step);
    }

    public Step getStep(int id) {
        return target.get(id);
    }

    public void deleteStep(int id) {
        target.remove(id);
    }

}
