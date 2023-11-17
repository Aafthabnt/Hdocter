package com.hospital.Docter.service;

import com.hospital.Docter.Repository.DocterInfoRepo;
import com.hospital.Docter.controller.DocterDetailsController;
import com.hospital.Docter.entities.DocterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocterService {
    @Autowired
    DocterInfoRepo docterInfoRepo;
    @Autowired
    DocterDetailsController docterDetailsController;

    public long saveDocterDetails(DocterInfo docterInfo){
        var res=docterInfoRepo.save(docterInfo);
        return res.getDocterId();

    }

    public List<DocterInfo> getAllDocterInfo(){
        return docterInfoRepo.findAll();
    }

}
