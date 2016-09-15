/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.vo.cal;

/**
 *
 * @author MAURO
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CalSchool")
public class CalSchool implements Serializable {
    
    private Long cal_IdCalSchool;
    private String code;
    private String abreviation;
    private String name;
    private String start;
    private String startVacation;
    private String endVacation;
    private String end;
    private String type;
    private String file;
    private Long year;
    private String status;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name="cal_IdCalSchool")
    public Long getcal_IdCalSchool() {
        return cal_IdCalSchool;
    }
    public void setcal_IdCalSchool(Long cal_IdCalSchool) {
        this.cal_IdCalSchool = cal_IdCalSchool;
    }

    @Column(name="code")
    public String getcode() {
        return code;
    }
    public void setcode(String code) {
        this.code = code;
    }

    @Column(name="abreviation")
    public String getabreviation() {
        return abreviation;
    }
    public void setabreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    @Column(name="name")
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    @Column(name="start")
    public String getstart() {
        return start;
    }
    public void setstart(String start) {
        this.start = start;
    }

    @Column(name="startVacation")
    public String getstartVacation() {
        return startVacation;
    }
    public void setstartVacation(String startVacation) {
        this.startVacation = startVacation;
    }

    @Column(name="endVacation")
    public String getendVacation() {
        return endVacation;
    }
    public void setendVacation(String endVacation) {
        this.endVacation = endVacation;
    }

    @Column(name="end")
    public String getend() {
        return end;
    }
    public void setend(String end) {
        this.end = end;
    }

    @Column(name="type")
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }
    
    @Column(name="file")
    public String getfile() {
        return file;
    }
    public void setfile(String file) {
        this.file = file;
    }
    
    @Column(name="year")
    public Long getyear() {
        return year;
    }
    public void setyear(Long year) {
        this.year = year;
    }

    @Column(name="status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
