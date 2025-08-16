package com.TestMangemnet.test.controller;

import com.TestMangemnet.test.dto.TestCaseExecutionKPI;
import com.TestMangemnet.test.service.TestCaseExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;



@RestController
@RequestMapping("/api/test-execution")
public class TestCaseExecutionController {
    @Autowired
    private  TestCaseExecutionService service;


    // Overall KPI
    @GetMapping("/kpi")
    public ResponseEntity<TestCaseExecutionKPI> getOverallKPI() {
        return ResponseEntity.ok(service.getOverallKPI());
    }

    @GetMapping("/kpi/filter")
    public ResponseEntity<TestCaseExecutionKPI> getFilteredKPI(@RequestParam(required = false) String module,
                                                              @RequestParam(required = false) @DateTimeFormat(iso =DateTimeFormat.ISO.DATE) java.time.LocalDate startDate,
                                                               @RequestParam(required = false) @DateTimeFormat(iso =DateTimeFormat.ISO.DATE) java.time.LocalDate endDate
                                                               ) {
        Date start =startDate != null ? Date.valueOf(startDate) :null; //returns a date object
        Date end = endDate != null ? Date.valueOf(endDate) : null;

        return new ResponseEntity<TestCaseExecutionKPI>(service.getFilteredKPI(module,start,end), HttpStatus.OK);

    }


//    @GetMapping
//    public ResponseEntity<TestCaseExecutionKPI> getExecutionKPI(
//            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
//            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate   endDate,
//            @RequestParam(required = false) String moduleName) {
//
//        TestCaseExecutionKPI kpi = service.getKPIByDate(startDate, endDate, moduleName);
//        return ResponseEntity.ok(kpi);
//    }
}
