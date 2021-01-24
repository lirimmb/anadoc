package com.anadoc.project.controller;


import com.anadoc.project.models.Commission;
import com.anadoc.project.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommissionController {

    @Autowired
    private CommissionService service;

    @PostMapping("/addCommission")
    public Commission addCommission(@RequestBody Commission commission){
        return service.saveCommision(commission);
    }
}
