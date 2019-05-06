
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AdministrativeArea implements Serializable
{

    @SerializedName("AdministrativeAreaName")
    @Expose
    private String administrativeAreaName;
    private final static long serialVersionUID = 669092553522988226L;

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public AdministrativeArea withAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("administrativeAreaName", administrativeAreaName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(administrativeAreaName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministrativeArea) == false) {
            return false;
        }
        AdministrativeArea rhs = ((AdministrativeArea) other);
        return new EqualsBuilder().append(administrativeAreaName, rhs.administrativeAreaName).isEquals();
    }

}
