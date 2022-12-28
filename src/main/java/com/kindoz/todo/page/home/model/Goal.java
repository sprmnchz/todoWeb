package com.kindoz.todo.page.home.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Goal {

    private List<Step> target = new ArrayList<>();

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
