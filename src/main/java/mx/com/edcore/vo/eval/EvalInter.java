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
@Table(name="EvalInter")
public class EvalInter implements Serializable {
    
    private Long eval_IdInter;
    private Long cal_IdCalSchool;
    private Long user_IdStudent;
    private Long group_IdGroupSubject;
  

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="eval_IdInter")
    public Long geteval_IdInter() {
        return eval_IdInter;
    }
    public void seteval_IdInter(Long eval_IdInter) {
        this.eval_IdInter = eval_IdInter;
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
    
    @Column(name="group_IdGroupSubject")
    public Long getgroup_IdGroupSubject() {
        return group_IdGroupSubject;
    }
    public void setgroup_IdGroupSubject(Long group_IdGroupSubject) {
        this.group_IdGroupSubject = group_IdGroupSubject;
    }


}
