package com.Rim.Test.controller;

import com.Rim.Test.Entity.Point;
import com.Rim.Test.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HomeController {
    @Autowired
    private PointService pointService;

    @GetMapping("/")
    public String showHome(Model model){
        List<Point> points = pointService.getAllPoint();
        model.addAttribute("points",points);
        return "home";
    }
}
