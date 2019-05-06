
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class AddressDetails implements Serializable
{

    @SerializedName("Country")
    @Expose
    private Country country;
    private final static long serialVersionUID = 8282108182610561309L;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public AddressDetails withCountry(Country country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("country", country).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressDetails) == false) {
            return false;
        }
        AddressDetails rhs = ((AddressDetails) other);
        return new EqualsBuilder().append(country, rhs.country).isEquals();
    }

}
