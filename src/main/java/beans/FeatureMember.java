
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class FeatureMember implements Serializable
{

    @SerializedName("GeoObject")
    @Expose
    private GeoObject geoObject;
    private final static long serialVersionUID = 683503425719098021L;

    public GeoObject getGeoObject() {
        return geoObject;
    }

    public void setGeoObject(GeoObject geoObject) {
        this.geoObject = geoObject;
    }

    public FeatureMember withGeoObject(GeoObject geoObject) {
        this.geoObject = geoObject;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geoObject", geoObject).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geoObject).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureMember) == false) {
            return false;
        }
        FeatureMember rhs = ((FeatureMember) other);
        return new EqualsBuilder().append(geoObject, rhs.geoObject).isEquals();
    }

}
