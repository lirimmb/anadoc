package com.anadoc.project.service;

import com.anadoc.project.models.Commission;
import com.anadoc.project.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Commission saveCommision(Commission commission) {
        return commissionRepository.save(commission);
    }

    public List<Commission> saveCommissions(List<Commission> commissions) {
        return commissionRepository.saveAll(commissions);
    }

    public List<Commission> getAllCommission(){
        return commissionRepository.findAll();
    }

    public Commission getCommisionById(int id){
        return commissionRepository.findById(id).orElse(null);
    }

    public String deleteCommission(int id){
        commissionRepository.deleteById(id);
        return "Commission deleted!";
    }

    public Commission update(Commission commission){
        Commission existingCommission = commissionRepository.findById(commission.getId()).orElse(null);
        existingCommission.setFirstName(commission.getFirstName());
        existingCommission.setLastName(commission.getLastName());
        existingCommission.setBirthday(commission.getBirthday());
        existingCommission.setUsername(commission.getUsername());
        existingCommission.setPassword(commission.getPassword());
        return commissionRepository.save(commission);
    }
}
