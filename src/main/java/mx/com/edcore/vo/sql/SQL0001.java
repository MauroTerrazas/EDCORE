
package mx.com.edcore.vo.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SQL0001")
public class SQL0001 implements Serializable {
    
    private Long id;
    private Long country;
    private String countryName;
    private Long state;
    private String stateName;
    private Long town;
    private String townName;
    private Long location;
    private String locationName;
    private String postCode;
    private String street;
    private Integer numExternal;
    private String numInternal;
    private String phone;
    private String cellPhone;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="country")
    public Long getCountry() {
        return country;
    }
    public void setCountry(Long country) {
        this.country = country;
    }

    @Column(name="countryName")
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Column(name="state")
    public Long getState() {
        return state;
    }
    public void setState(Long state) {
        this.state = state;
    }

    @Column(name="stateName")
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Column(name="town")
    public Long getTown() {
        return town;
    }
    public void setTown(Long town) {
        this.town = town;
    }

    @Column(name="townName")
    public String getTownName() {
        return townName;
    }
    public void setTownName(String townName) {
        this.townName = townName;
    }

    @Column(name="location")
    public Long getLocation() {
        return location;
    }
    public void setLocation(Long location) {
        this.location = location;
    }

    @Column(name="locationName")
    public String getLocationName() {
        return locationName;
    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
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
    public Integer getNumExternal() {
        return numExternal;
    }
    public void setNumExternal(Integer numExternal) {
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
    
    @Column(name="cellPhone")
    public String getCellPhone() {
        return cellPhone;
    }
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
