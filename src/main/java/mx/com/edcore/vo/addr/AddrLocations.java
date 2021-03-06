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
@Table(name="AddrLocations")
public class AddrLocations implements Serializable {
    
    private Long addr_IdState;
    private Long addr_IdTown;
    private Long addr_IdLocation;
    private Long postCode;
    private String name;
    private String township;
    private String zone;
    private String status;
   

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="addr_IdState")
    public Long getaddr_IdState() {
        return addr_IdState;
    }
    public void setaddr_IdState(Long addr_IdState) {
        this.addr_IdState = addr_IdState;
    }

    @Column(name="addr_IdTown")
    public Long getaddr_IdTown() {
        return addr_IdTown;
    }
    public void setaddr_IdTown(Long addr_IdTown) {
        this.addr_IdTown = addr_IdTown;
    }

    @Column(name="addr_IdLocation")
    public Long getaddr_IdLocation() {
        return addr_IdLocation;
    }
    public void setaddr_IdLocation(Long addr_IdLocation) {
        this.addr_IdLocation = addr_IdLocation;
    }

    @Column(name="postCode")
    public Long getpostCode() {
        return postCode;
    }
    public void setpostCode(Long postCode) {
        this.postCode = postCode;
    }

    @Column(name="name")
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    @Column(name="township")
    public String gettownship() {
        return township;
    }
    public void settownship(String township) {
        this.township = township;
    }

    @Column(name="zone")
    public String getzone() {
        return zone;
    }
    public void setzone(String zone) {
        this.zone = zone;
    }

    @Column(name="status")
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
