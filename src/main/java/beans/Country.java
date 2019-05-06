
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Country implements Serializable
{

    @SerializedName("AddressLine")
    @Expose
    private String addressLine;
    @SerializedName("CountryNameCode")
    @Expose
    private String countryNameCode;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("AdministrativeArea")
    @Expose
    private AdministrativeArea administrativeArea;
    private final static long serialVersionUID = 4193391826439079230L;

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public Country withAddressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    public String getCountryNameCode() {
        return countryNameCode;
    }

    public void setCountryNameCode(String countryNameCode) {
        this.countryNameCode = countryNameCode;
    }

    public Country withCountryNameCode(String countryNameCode) {
        this.countryNameCode = countryNameCode;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Country withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public Country withAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addressLine", addressLine).append("countryNameCode", countryNameCode).append("countryName", countryName).append("administrativeArea", administrativeArea).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(addressLine).append(countryName).append(administrativeArea).append(countryNameCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return new EqualsBuilder().append(addressLine, rhs.addressLine).append(countryName, rhs.countryName).append(administrativeArea, rhs.administrativeArea).append(countryNameCode, rhs.countryNameCode).isEquals();
    }

}
