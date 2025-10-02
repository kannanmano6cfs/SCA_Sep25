package com.learning.payrollservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Payroll {

    @Id
    @GeneratedValue
    private int payrollId;
    private String empname;
    private String deptname;
    private double basic;
    private double DA;
    private double HRA;
    private double PF;
    private double gross;

    public Payroll() {
    }

    public Payroll(int payrollId, String empname, String deptname, double basic, double DA, double HRA, double PF, double gross) {
        this.payrollId = payrollId;
        this.empname = empname;
        this.deptname = deptname;
        this.basic = basic;
        this.DA = DA;
        this.HRA = HRA;
        this.PF = PF;
        this.gross = gross;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDA() {
        return DA;
    }

    public void setDA(double DA) {
        this.DA = DA;
    }

    public double getHRA() {
        return HRA;
    }

    public void setHRA(double HRA) {
        this.HRA = HRA;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", Empname='" + empname + '\'' +
                ", Deptname='" + deptname + '\'' +
                ", basic=" + basic +
                ", DA=" + DA +
                ", HRA=" + HRA +
                ", PF=" + PF +
                ", gross=" + gross +
                '}';
    }
}
