package com.TestMangemnet.test.repository;

import com.TestMangemnet.test.dto.TestCaseExecutionKPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TestCaseExecutionRepository {

@Autowired
private JdbcTemplate jdbcTemplate;

    public TestCaseExecutionKPI getKPI(String module, Date startDate, Date endDate) {
        StringBuilder query = new StringBuilder("SELECT status FROM test_case_execution WHERE 1=1");

        new Object() {}; // dummy line so code formatting doesn't mess up

        new Object();

        // Dynamic filtering
        if (module != null) {
            query.append(" AND module = ?");
        }

        if (startDate != null && endDate != null) {
            query.append(" AND execution_date BETWEEN ? AND ?");
        }

        // Build params
        List<Object> params = new java.util.ArrayList<>();
        if (module != null) params.add(module);
        if (startDate != null && endDate != null) {
            params.add(startDate);
            params.add(endDate);
        }

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(query.toString(), params.toArray());

        //query return status
        int total = rows.size();
        int executed = (int) rows.stream().filter(r -> r.get("status") != null && !"Not Executed".equals(r.get("status"))).count();
        int passed = (int) rows.stream().filter(r -> "Passed".equals(r.get("status"))).count();
        int failed = (int) rows.stream().filter(r -> "Failed".equals(r.get("status"))).count();


        TestCaseExecutionKPI kpi = new TestCaseExecutionKPI();
        kpi.setTotalTestCases(total);
        kpi.setExecutedTestCases(executed);
        kpi.setPassedTestCases(passed);
        kpi.setFailedTestCases(failed);

        kpi.setExecutionRate(total > 0 ? (executed * 100.0) / total : 0);
        kpi.setPassRate(executed > 0 ? (passed * 100.0) / executed : 0);
        kpi.setFailRate(executed > 0 ? (failed * 100.0) / executed : 0);

        return kpi;
    }


//    public TestCaseExecutionKPI getKPIByDate(LocalDate startDate, LocalDate endDate, String moduleName) {
//        StringBuilder sql = new StringBuilder("""
//            SELECT
//                COUNT(*) AS total,
//                SUM(CASE WHEN execution_status IN ('Passed', 'Failed') THEN 1 ELSE 0 END) AS executed
//            FROM test_execution te
//            JOIN test_case tc ON te.test_case_id = tc.id
//            WHERE 1=1
//        """);
//
//        List<Object> params = new ArrayList<>();
//
//        if (startDate != null) {
//            sql.append(" AND te.executed_on >= ? ");
//            params.add(Date.valueOf(startDate));
//        }
//
//        if (endDate != null) {
//            sql.append(" AND te.executed_on <= ? ");
//            params.add(Date.valueOf(endDate));
//        }
//
//        if (moduleName != null && !moduleName.isEmpty()) {
//            sql.append(" AND tc.module_name = ? ");
//            params.add(moduleName);
//        }
//
//        return jdbcTemplate.queryForObject(sql.toString(), params.toArray(), (rs, rowNum) -> {
//            int total = rs.getInt("total");
//            int executed = rs.getInt("executed");
//
//            TestCaseExecutionKPI kpi = new TestCaseExecutionKPI();
//            kpi.setTotalTestCases(total);
//            kpi.setExecutedTestCases(executed);
//            kpi.setExecutionRate(total == 0 ? 0 : (executed * 100.0) / total);
//            return kpi;
//        });
//    }
}
