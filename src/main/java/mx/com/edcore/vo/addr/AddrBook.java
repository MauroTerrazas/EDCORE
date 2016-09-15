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
@Table(name="AddrBook")
public class AddrBook implements Serializable {
    
    private Long addr_IdAddrBook;
    private Long addr_IdLocation;
    private String street;
    private Long numExternal;
    private Long numInternal;
    private String phone;
    private String cellPhone;
    private String alternativeEmail;
    private String fax;
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="addr_IdAddrBook")
    public Long getaddr_IdAddrBook() {
        return addr_IdAddrBook;
    }
    public void setaddr_IdAddrBook(Long addr_IdAddrBook) {
        this.addr_IdAddrBook = addr_IdAddrBook;
    }

    @Column(name="addr_IdLocation")
    public Long getaddr_IdLocation() {
        return addr_IdLocation;
    }
    public void setaddr_IdLocation(Long addr_IdLocation) {
        this.addr_IdLocation = addr_IdLocation;
    }

    @Column(name="street")
    public String getstreet() {
        return street;
    }
    public void setstreet(String street) {
        this.street = street;
    }

    @Column(name="numExternal")
    public Long getnumExternal() {
        return numExternal;
    }
    public void setnumExternal(Long numExternal) {
        this.numExternal = numExternal;
    }

    @Column(name="numInternal")
    public Long getnumInternal() {
        return numInternal;
    }
    public void setnumInternal(Long numInternal) {
        this.numInternal = numInternal;
    }

    @Column(name="phone")
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    @Column(name="cellPhone")
    public String getcellPhone() {
        return cellPhone;
    }
    public void setcellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Column(name="alternativeEmail")
    public String getalternativeEmail() {
        return alternativeEmail;
    }
    public void setalternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    @Column(name="fax")
    public String getfax() {
        return fax;
    }
    public void setfax(String fax) {
        this.fax = fax;
    }

}