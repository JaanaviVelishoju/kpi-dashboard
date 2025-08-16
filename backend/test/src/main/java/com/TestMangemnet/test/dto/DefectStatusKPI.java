package com.TestMangemnet.test.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

//dao (interface+ implementation) class is to interact with db and ,but this project directly doing as repositoty class.
//entity class is used for that to add that type of object to db, and have response entity of that type.
//for this case using dto (data trafers object to pass as response of required type of particular variable)
public class DefectStatusKPI
{
    private int totalDefects;
    private int openDefects;
    private int closedDefects;
    private int inProgressDefects;

    private double openRate;
    private double closedRate;
    private double inProgressRate;

    public int getTotalDefects() {
        return totalDefects;
    }

    public void setTotalDefects(int totalDefects) {
        this.totalDefects = totalDefects;
    }

    public int getOpenDefects() {
        return openDefects;
    }

    public void setOpenDefects(int openDefects) {
        this.openDefects = openDefects;
    }

    public int getClosedDefects() {
        return closedDefects;
    }

    public void setClosedDefects(int closedDefects) {
        this.closedDefects = closedDefects;
    }

    public int getInProgressDefects() {
        return inProgressDefects;
    }

    public void setInProgressDefects(int inProgressDefects) {
        this.inProgressDefects = inProgressDefects;
    }

    public double getOpenRate() {
        return openRate;
    }

    public void setOpenRate(double openRate) {
        this.openRate = openRate;
    }

    public double getClosedRate() {
        return closedRate;
    }

    public void setClosedRate(double closedRate) {
        this.closedRate = closedRate;
    }

    public double getInProgressRate() {
        return inProgressRate;
    }

    public void setInProgressRate(double inProgressRate) {
        this.inProgressRate = inProgressRate;
    }
}

