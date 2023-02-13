package com.kindoz.todo.page.home.controller;


import com.kindoz.todo.model.Step;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/step")
public class StepController {

    @ModelAttribute
    public void addStepsToModel(Model model) {

        Step step = new Step("1");
        step.addChildrenStep(new Step("1", step));
        step.addChildrenStep(new Step("2", step));
        step.addChildrenStep(new Step("3", step));
        step.addChildrenStep(new Step("4", step));
        step = step.getChildrenStep(0);
        step.addChildrenStep(new Step("1", step));
        step.addChildrenStep(new Step("2", step));
        step.addChildrenStep(new Step("3", step));
        step.addChildrenStep(new Step("4", step));
        step = step.getChildrenStep(1);
        step.addChildrenStep(new Step("1", step));
        step.addChildrenStep(new Step("2", step));
        step.addChildrenStep(new Step("3", step));
        step.addChildrenStep(new Step("4", step));
        step = step.getParentStep();
        step = step.getParentStep();
        step = step.getChildrenStep(1);
        step.addChildrenStep(new Step("1", step));
        step.addChildrenStep(new Step("2", step));
        step.addChildrenStep(new Step("3", step));
        step.addChildrenStep(new Step("4", step));

    }

    @ModelAttribute(name = "step")
    public Step step() {
        return new Step();
    }

    @GetMapping
    public  String showStepForm() {
        return "step";
    }

}
