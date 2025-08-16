package com.TestMangemnet.test.service;

import com.TestMangemnet.test.dto.TestCaseExecutionKPI;
import com.TestMangemnet.test.repository.TestCaseExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestCaseExecutionService {


    private final TestCaseExecutionRepository repository;

    public TestCaseExecutionService(TestCaseExecutionRepository repository) {
        this.repository = repository;
    }

    public TestCaseExecutionKPI getOverallKPI() {
        return repository.getKPI(null, null, null);
    }

    public TestCaseExecutionKPI getFilteredKPI(String module,Date startDate, Date endDate) {
        return repository.getKPI(module,startDate,endDate);
    }


//    public TestCaseExecutionKPI getKPIByDate(LocalDate startDate, LocalDate endDate, String moduleName) {
//        return repository.getKPIByDate(startDate,endDate,moduleName);
//    }
}
