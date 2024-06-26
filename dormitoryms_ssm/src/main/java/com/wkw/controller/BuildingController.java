package com.wkw.controller;

import com.wkw.entity.Building;
import com.wkw.service.BuildingService;
import com.wkw.service.DormitoryAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;
    @Autowired
    private DormitoryAdminService dormitoryAdminService;

    @GetMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("buildingmanager");
        modelAndView.addObject("list", this.buildingService.list());
        modelAndView.addObject("dormitoryAdminList", this.dormitoryAdminService.list());
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("buildingmanager");
        modelAndView.addObject("list", this.buildingService.search(key, value));
        modelAndView.addObject("dormitoryAdminList", this.dormitoryAdminService.list());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Building building){
        this.buildingService.save(building);
        return "redirect:/building/list";
    }

    @PostMapping("/update")
    public String update(Building building){
        this.buildingService.update(building);
        return "redirect:/building/list";
    }

    @PostMapping("/delete")
    public String delete(Integer id){
        this.buildingService.delete(id);
        return "redirect:/building/list";
    }
}
