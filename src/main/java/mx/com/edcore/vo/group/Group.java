package mx.com.edcore.vo.group;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GroupSubject")
public class Group implements Serializable {
    
    private Long id;
    private Long pack;
    private Long subject;
    private Long professor;
    private String code;
    private String name;
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="group_IdGroupSubject")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="group_IdGroup")
    public Long getPack() {
        return pack;
    }
    public void setPack(Long pack) {
        this.pack = pack;
    }

    @Column(name="prog_IdSubject")
    public Long getSubject() {
        return subject;
    }
    public void setSubject(Long subject) {
        this.subject = subject;
    }

    @Column(name="user_IdProfessor")
    public Long getProfessor() {
        return professor;
    }
    public void setProfessor(Long professor) {
        this.professor = professor;
    }

    @Column(name="code")
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
