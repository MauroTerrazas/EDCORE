/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edcore.vo.addr;

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
@Table(name="AddrStates")
public class AddrStates implements Serializable {
    
    private Long addr_IdState;
    private Long addr_IdCountry;
    private String code;
    private String name;
 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="addr_IdState")
    public Long getaddr_IdState() {
        return addr_IdState;
    }
    public void setaddr_IdState(Long addr_IdState) {
        this.addr_IdState = addr_IdState;
    }

    @Column(name="addr_IdCountry")
    public Long getaddr_IdCountry() {
        return addr_IdCountry;
    }
    public void setaddr_IdCountry(Long addr_IdCountry) {
        this.addr_IdCountry = addr_IdCountry;
    }

    @Column(name="code")
    public String getcode() {
        return code;
    }
    public void setcode(String code) {
        this.code = code;
    }

    @Column(name="name")
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

}
