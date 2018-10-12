package controller;

import model.ModelHackerRankProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceAlgorithmCategory;

@RestController
@RequestMapping("/algorithm")
public class ControllerAlgorithmCategory {

    @Autowired
    private ServiceAlgorithmCategory serviceAlgorithmCategory;

    private static final int problemID = 11301;

    @RequestMapping(
            value = {"/show"},
            method = {RequestMethod.GET})
    public String getProblemCategory(){
        return "Show example response";
    }
}
