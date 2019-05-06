
package beans;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Address implements Serializable
{

    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("formatted")
    @Expose
    private String formatted;
    @SerializedName("Components")
    @Expose
    private List<Component> components = null;
    private final static long serialVersionUID = 689093016392523394L;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Address withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public Address withFormatted(String formatted) {
        this.formatted = formatted;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public Address withComponents(List<Component> components) {
        this.components = components;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("countryCode", countryCode).append("formatted", formatted).append("components", components).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formatted).append(countryCode).append(components).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(formatted, rhs.formatted).append(countryCode, rhs.countryCode).append(components, rhs.components).isEquals();
    }

}
