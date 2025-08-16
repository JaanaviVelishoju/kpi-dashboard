package com.TestMangemnet.test.controller;

import com.TestMangemnet.test.dto.DefectStatusKPI;
import com.TestMangemnet.test.service.DefectStatusKPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kpi")
public class DefectStatusKPIController {

    @Autowired
    private DefectStatusKPIService service;



    @GetMapping("/defects")
    public ResponseEntity<DefectStatusKPI> getDefectKPI() {
        DefectStatusKPI kpi = service.getDefectStatusKPI();
        return ResponseEntity.ok(kpi);
    }
}
