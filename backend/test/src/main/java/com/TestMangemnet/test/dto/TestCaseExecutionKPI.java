package com.TestMangemnet.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestCaseExecutionKPI {
    private int totalTestCases;
    private int executedTestCases;
    private int passedTestCases;
    private int failedTestCases;

    private double executionRate;
    private double passRate;
    private double failRate;

    public int getTotalTestCases() {
        return totalTestCases;
    }

    public void setTotalTestCases(int totalTestCases) {
        this.totalTestCases = totalTestCases;
    }

    public int getExecutedTestCases() {
        return executedTestCases;
    }

    public void setExecutedTestCases(int executedTestCases) {
        this.executedTestCases = executedTestCases;
    }

    public int getPassedTestCases() {
        return passedTestCases;
    }

    public void setPassedTestCases(int passedTestCases) {
        this.passedTestCases = passedTestCases;
    }

    public int getFailedTestCases() {
        return failedTestCases;
    }

    public void setFailedTestCases(int failedTestCases) {
        this.failedTestCases = failedTestCases;
    }

    public double getExecutionRate() {
        return executionRate;
    }

    public void setExecutionRate(double executionRate) {
        this.executionRate = executionRate;
    }

    public double getPassRate() {
        return passRate;
    }

    public void setPassRate(double passRate) {
        this.passRate = passRate;
    }

    public double getFailRate() {
        return failRate;
    }

    public void setFailRate(double failRate) {
        this.failRate = failRate;
    }
}

