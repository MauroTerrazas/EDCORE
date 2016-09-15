/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.vo.eval;

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
@Table(name="EvalExam")
public class EvalExam implements Serializable {
    
    private Long eval_IdExam;
    private Long cal_IdCalSchool;
    private Long user_IdStudent;
    private Long prog_IdSubject;
    private Long grade;
    private String type;
    private String status;
  

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="eval_IdExam")
    public Long geteval_IdExam() {
        return eval_IdExam;
    }
    public void seteval_IdExam(Long eval_IdExam) {
        this.eval_IdExam = eval_IdExam;
    }

    @Column(name="cal_IdCalSchool")
    public Long getcal_IdCalSchool() {
        return cal_IdCalSchool;
    }
    public void setcal_IdCalSchool(Long cal_IdCalSchool) {
        this.cal_IdCalSchool = cal_IdCalSchool;
    }

     @Column(name="user_IdStudent")
    public Long getuser_IdStudent() {
        return user_IdStudent;
    }
    public void setuser_IdStudent(Long user_IdStudent) {
        this.user_IdStudent = user_IdStudent;
    }
    
    @Column(name="prog_IdSubject")
    public Long getprog_IdSubject() {
        return prog_IdSubject;
    }
    public void setprog_IdSubject(Long prog_IdSubject) {
        this.prog_IdSubject = prog_IdSubject;
    }

    @Column(name="grade")
    public Long getgrade() {
        return grade;
    }
    public void setgrade(Long grade) {
        this.grade = grade;
    }

    @Column(name="type")
    public String gettype() {
        return type;
    }
    public void settype(String type) {
        this.type = type;
    }

    @Column(name="status")
    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
    }

}
