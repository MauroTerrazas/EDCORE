package mx.com.edcore.vo.prog;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProCoSubjects")
public class PlanCoRequirement implements Serializable {
    
    private Long id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="prog_IdCS")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    
}
