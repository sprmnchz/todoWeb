package com.kindoz.todo.page.home.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Workspace {

    private List<Goal> workspace = new ArrayList<>();

    public void addGoal(Goal goal) {
        workspace.add(goal);
    }

    public void deleteGoal(int id){
        workspace.remove(id);
    }

    public int getIdGoal(Goal goal){
        return workspace.indexOf(goal);
    }

    public int lastIndex () {
        return workspace.size();
    }

}
