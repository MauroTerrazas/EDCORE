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
@Table(name="CalRegistrations")
public class CalRegistrations implements Serializable {
    
    private Long cal_IdRegistracion;
    private Long cal_IdCalSchool;
    private Long safe_IdComponent;
    private String code;
    private String title;
    private String start;
    private String end;
    private String status;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cal_IdRegistracion")
    public Long getcal_IdRegistracion() {
        return cal_IdRegistracion;
    }
    public void setcal_IdRegistracion(Long cal_IdRegistracion) {
        this.cal_IdRegistracion = cal_IdRegistracion;
    }

    @Column(name="cal_IdCalSchool")
    public Long getcal_IdCalSchool() {
        return cal_IdCalSchool;
    }
    public void setcal_IdCalSchool(Long cal_IdCalSchool) {
        this.cal_IdCalSchool = cal_IdCalSchool;
    }

    @Column(name="safe_IdComponent")
    public Long getsafe_IdComponent() {
        return safe_IdComponent;
    }
    public void setsafe_IdComponent(Long safe_IdComponent) {
        this.safe_IdComponent = safe_IdComponent;
    }

    @Column(name="code")
    public String getcode() {
        return code;
    }
    public void setcode(String code) {
        this.code = code;
    }

    @Column(name="title")
    public String getapplication() {
        return title;
    }
    public void setapplication(String title) {
        this.title = title;
    }

    @Column(name="start")
    public String getstart() {
        return start;
    }
    public void setstart(String start) {
        this.start = start;
    }

    @Column(name="end")
    public String getend() {
        return end;
    }
    public void setend(String end) {
        this.end = end;
    }

    @Column(name="status")
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }
}
