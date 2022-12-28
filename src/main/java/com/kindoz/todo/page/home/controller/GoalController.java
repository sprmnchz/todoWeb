package com.kindoz.todo.page.home.controller;

import com.kindoz.todo.Config;
import com.kindoz.todo.page.home.model.Goal;
import com.kindoz.todo.page.home.model.Step;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Slf4j
@Controller
@RequestMapping("/goal")
@SessionAttributes("Goal")
public class GoalController {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(Config.class);
    Goal goal = context.getBean("goal",Goal.class);

    @ModelAttribute
    public void addStep(Model model) {

        goal.addStep(new Step(0,"step0"));
        goal.addStep(new Step(1,"step1"));
        goal.addStep(new Step(2,"step2"));
        goal.addStep(new Step(3,"step3"));
        goal.addStep(new Step(4,"step4"));


        context.close();
    }

}
