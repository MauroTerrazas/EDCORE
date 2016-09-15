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
@Table(name="AddrCountries")
public class AddrCountries implements Serializable {
    
    private Long addr_IdCountry;
    private Long addr_IdCurrency;
    private String code;
    private String name;
    
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="addr_IdCountry")
    public Long getaddr_IdCountry() {
        return addr_IdCountry;
    }
    public void setaddr_IdCountry(Long addr_IdCountry) {
        this.addr_IdCountry = addr_IdCountry;
    }

    @Column(name="addr_IdCurrency")
    public Long getaddr_IdCurrency() {
        return addr_IdCurrency;
    }
    public void setaddr_IdCurrency(Long addr_IdCurrency) {
        this.addr_IdCurrency = addr_IdCurrency;
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
