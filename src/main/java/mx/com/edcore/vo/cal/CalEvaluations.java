package mx.com.edcore.vo.cal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CalEvaluations")
public class CalEvaluations implements Serializable {
    
    private Long cal_IdEvaluation;
    private Long cal_IdCalSchool;
    private String code;
    private Long evaluation;
    private String application;
    private String start;
    private String end;
    private String type;
    private String status;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cal_IdCalSchool")
    public Long getcal_IdEvaluation() {
        return cal_IdEvaluation;
    }
    public void setcal_IdEvaluation(Long cal_IdEvaluation) {
        this.cal_IdEvaluation = cal_IdEvaluation;
    }

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

    @Column(name="evaluation")
    public Long getevaluation() {
        return evaluation;
    }
    public void setName(Long evaluation) {
        this.evaluation = evaluation;
    }

    @Column(name="application")
    public String getapplication() {
        return application;
    }
    public void setapplication(String application) {
        this.application = application;
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

    @Column(name="type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    @Column(name="status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
