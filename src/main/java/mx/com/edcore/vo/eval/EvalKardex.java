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
@Table(name="EvalKardex")
public class EvalKardex implements Serializable {
    
    private Long eval_IdKardex;
    private Long user_IdStudent;
    private Long cal_IdCalSchool;
    private Long prog_IdSubject;
    private Long grade;
    private Long semester;
    private String option;
  

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="eval_IdKardex")
    public Long geteval_IdKardex() {
        return eval_IdKardex;
    }
    public void seteval_IdKardex(Long eval_IdKardex) {
        this.eval_IdKardex = eval_IdKardex;
    }

    @Column(name="user_IdStudent")
    public Long getuser_IdStudent() {
        return user_IdStudent;
    }
    public void setuser_IdStudent(Long user_IdStudent) {
        this.user_IdStudent = user_IdStudent;
    }

    @Column(name="cal_IdCalSchool")
    public Long getcal_IdCalSchool() {
        return cal_IdCalSchool;
    }
    public void setcal_IdCalSchool(Long cal_IdCalSchool) {
        this.cal_IdCalSchool = cal_IdCalSchool;
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

    @Column(name="semester")
    public Long getsemester() {
        return semester;
    }
    public void setsemester(Long semester) {
        this.semester = semester;
    }

    @Column(name="option")
    public String getoption() {
        return option;
    }
    public void setoption(String option) {
        this.option = option;
    }

}
