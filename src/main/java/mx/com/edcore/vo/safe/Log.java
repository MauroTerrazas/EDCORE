package mx.com.edcore.vo.safe;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SafeLogs")
public class Log implements Serializable {
    
    private Long id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="safe_IdLog")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    
}
