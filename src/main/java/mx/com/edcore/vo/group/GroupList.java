package mx.com.edcore.vo.group;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GroupList")
public class GroupList implements Serializable {
    
    private Long id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="group_IdList")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    
}
