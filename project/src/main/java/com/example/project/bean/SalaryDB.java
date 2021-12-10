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
    private int user_id;

    @Column
    private String department;

    @Column
    private String name;

    @Column
    private String month;

    @Column
    private int basic;

    @Column
    private int HRA;

    @Column
    private int LTA;

    @Column
    private int others;

    @Column
    private int PF;

    @Column
    private int tax;

    @Column
    private int net_pay;

    public SalaryDB() {

    }

    public SalaryDB(int user_id, String department, String name, String month, int basic, int HRA, int LTA, int others, int PF, int tax, int net_pay) {
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

    public int getUser_id() {
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

    public int getBasic() {
        return basic;
    }

    public int getHRA() {
        return HRA;
    }

    public int getLTA() {
        return LTA;
    }

    public int getOthers() {
        return others;
    }

    public int getPF() {
        return PF;
    }

    public int getTax() {
        return tax;
    }

    public int getNet_pay() {
        return net_pay;
    }
}
