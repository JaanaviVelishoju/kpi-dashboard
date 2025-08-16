package com.TestMangemnet.test.service;

import com.TestMangemnet.test.dto.DefectStatusKPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DefectStatusKPIService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public DefectStatusKPI getDefectStatusKPI() {

        DefectStatusKPI kpi = new DefectStatusKPI();

        int total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM defects", Integer.class);
        int open = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM defects WHERE defect_status='Open'", Integer.class);
        int closed = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM defects WHERE defect_status='Closed'", Integer.class);
        int inProgress = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM defects WHERE defect_status='In Progress'", Integer.class);

        kpi.setTotalDefects(total);
        kpi.setOpenDefects(open);
        kpi.setClosedDefects(closed);
        kpi.setInProgressDefects(inProgress);

        // Calculate rates
        kpi.setOpenRate(total > 0 ? (open * 100.0) / total : 0);
        kpi.setClosedRate(total > 0 ? (closed * 100.0) / total : 0);
        kpi.setInProgressRate(total > 0 ? (inProgress * 100.0) / total : 0);

        return kpi;
    }
}
