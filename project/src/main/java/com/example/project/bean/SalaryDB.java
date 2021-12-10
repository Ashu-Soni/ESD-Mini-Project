package com.example.project.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class SalaryDB implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String user_id;

    @Column
    private String department;

    @Column
    private String name;

    @Column
    private String month;

    public SalaryDB(String user_id, String department, String name, String month, String basic, String HRA, String LTA, String others, String PF, String tax, String net_pay) {
        this.user_id = user_id;
        this.department = department;
        this.name = name;
        this.month = month;
        this.basic = basic;
        this.HRA = HRA;
        this.LTA = LTA;
        this.others = others;
        this.PF = PF;
        this.tax = tax;
        this.net_pay = net_pay;
    }

    @Column
    private String basic;

    @Column
    private String HRA;

    @Column
    private String LTA;

    @Column
    private String others;

    @Column
    private String PF;

    @Column
    private String tax;

    @Column
    private String net_pay;

    public SalaryDB() {

    }

    public String getUser_id() {
        return user_id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }

    public String getBasic() {
        return basic;
    }

    public String getHRA() {
        return HRA;
    }

    public String getLTA() {
        return LTA;
    }

    public String getOthers() {
        return others;
    }

    public String getPF() {
        return PF;
    }

    public String getTax() {
        return tax;
    }

    public String getNet_pay() {
        return net_pay;
    }
}
