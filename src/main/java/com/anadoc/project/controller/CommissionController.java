package com.anadoc.project.controller;


import com.anadoc.project.models.Commission;
import com.anadoc.project.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommissionController {

    @Autowired
    private CommissionService service;

    @PostMapping("/addCommission")
    public Commission addCommission(@RequestBody Commission commission){
        return service.saveCommision(commission);
    }

    @PostMapping("/addCommissions")
    public List<Commission> addCommissions(@RequestBody List<Commission> commissions){
        return service.saveCommissions(commissions);
    }

    @GetMapping("/commissions")
    public List<Commission> findAllCommissions(){
        return service.getAllCommission();
    }

    @GetMapping("/commission/{id}")
    public Commission findCommissionById(@PathVariable int id){
        return service.getCommisionById(id);
    }

    @PutMapping("/update")
    public Commission updateCommission(@RequestBody Commission commission){
        return service.update(commission);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCommission(@PathVariable int id){
        return service.deleteCommission(id);
    }
}
