
package mx.com.edcore.vo.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SQL0002")
public class SQL0002 implements Serializable {
    
    private Long id;
    private String code;
    private String revoe;
    private String dgp;
    private String shortName;
    private String name;
    private String slogan;
    private String url;
    private String key;
    private String country;
    private String state;
    private String town;
    private String location;
    private String postCode;
    private String street;
    private String numExternal;
    private String numInternal;
    private String phone;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
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

    @Column(name="revoe")
    public String getRevoe() {
        return revoe;
    }
    public void setRevoe(String revoe) {
        this.revoe = revoe;
    }

    @Column(name="dgp")
    public String getDgp() {
        return dgp;
    }

    public void setDgp(String dgp) {
        this.dgp = dgp;
    }

    @Column(name="shortName")
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

    @Column(name="slogan")
    public String getSlogan() {
        return slogan;
    }
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Column(name="url")
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name="key")
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name="country")
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name="state")
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Column(name="town")
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    @Column(name="location")
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name="postCode")
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Column(name="street")
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name="numExternal")
    public String getNumExternal() {
        return numExternal;
    }
    public void setNumExternal(String numExternal) {
        this.numExternal = numExternal;
    }

    @Column(name="numInternal")
    public String getNumInternal() {
        return numInternal;
    }
    public void setNumInternal(String numInternal) {
        this.numInternal = numInternal;
    }

    @Column(name="phone")
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
