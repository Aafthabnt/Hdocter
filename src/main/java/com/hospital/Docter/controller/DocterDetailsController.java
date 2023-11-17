package com.hospital.Docter.controller;

import com.hospital.Docter.entities.DocterInfo;
import com.hospital.Docter.service.DocterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value={"/hms/docter"})
public class DocterDetailsController {
    @Autowired
    DocterService docterService;
    @GetMapping()
    public List<DocterInfo> getAllDocterInfo(){
        return docterService.getAllDocterInfo();
    }
    @PostMapping("/docter/save")
    public long info(@RequestBody DocterInfo docterInfo){
        return docterService.saveDocterDetails(docterInfo);
    }
}
