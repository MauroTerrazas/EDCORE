package mx.com.edcore.vo.cal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CalSchool")
public class Calendar implements Serializable {
    
    private Long id;
    private String code;
    private String shortName;
    private String name;
    private String start;
    private String end;
    private String holidayStart;
    private String holidayEnd;
    private String type;
    private String year;
    private String status;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cal_IdCalSchool")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="code")
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    @Column(name="abreviation")
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="start")
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }

    @Column(name="end")
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

    @Column(name="startVacation")
    public String getHolidayStart() {
        return holidayStart;
    }
    public void setHolidayStart(String holidayStart) {
        this.holidayStart = holidayStart;
    }

    @Column(name="endVacation")
    public String getHolidayEnd() {
        return holidayEnd;
    }
    public void setHolidayEnd(String holidayEnd) {
        this.holidayEnd = holidayEnd;
    }

    @Column(name="type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name="year")
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
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
