package com.example.urbinoennasri.model;

import javax.persistence.*;

@Entity
public class Sondages {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idsondages;

        @JoinColumn(foreignKey = @ForeignKey(name = "FK_userid"))
        private int userid;
        @Column(name = "lieu1")
        private String lieu1;
        @Column(name = "lieu2")
        private String lieu2;
        @Column(name = "lieu3")
        private String lieu3;
        @Column(name = "date1")
        private String date1;
        @Column(name = "date2")
        private String date2;
        @Column(name = "date3")
        private String date3;

    public int getIdsondages() {
        return idsondages;
    }

    public void setIdsondages(int idsondages) {
        this.idsondages = idsondages;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getLieu1() {
        return lieu1;
    }

    public void setLieu1(String lieu1) {
        this.lieu1 = lieu1;
    }

    public String getLieu2() {
        return lieu2;
    }

    public void setLieu2(String lieu2) {
        this.lieu2 = lieu2;
    }

    public String getLieu3() {
        return lieu3;
    }

    public void setLieu3(String lieu3) {
        this.lieu3 = lieu3;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }
}
