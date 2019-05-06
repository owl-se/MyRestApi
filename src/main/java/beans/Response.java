
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Response implements Serializable
{

    @SerializedName("GeoObjectCollection")
    @Expose
    private GeoObjectCollection geoObjectCollection;
    private final static long serialVersionUID = 2885078452037633206L;

    public GeoObjectCollection getGeoObjectCollection() {
        return geoObjectCollection;
    }

    public void setGeoObjectCollection(GeoObjectCollection geoObjectCollection) {
        this.geoObjectCollection = geoObjectCollection;
    }

    public Response withGeoObjectCollection(GeoObjectCollection geoObjectCollection) {
        this.geoObjectCollection = geoObjectCollection;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geoObjectCollection", geoObjectCollection).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geoObjectCollection).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(geoObjectCollection, rhs.geoObjectCollection).isEquals();
    }

}
