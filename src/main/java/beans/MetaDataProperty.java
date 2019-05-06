
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MetaDataProperty implements Serializable
{

    @SerializedName("GeocoderResponseMetaData")
    @Expose
    private GeocoderResponseMetaData geocoderResponseMetaData;
    private final static long serialVersionUID = -7893326169158632155L;

    public GeocoderResponseMetaData getGeocoderResponseMetaData() {
        return geocoderResponseMetaData;
    }

    public void setGeocoderResponseMetaData(GeocoderResponseMetaData geocoderResponseMetaData) {
        this.geocoderResponseMetaData = geocoderResponseMetaData;
    }

    public MetaDataProperty withGeocoderResponseMetaData(GeocoderResponseMetaData geocoderResponseMetaData) {
        this.geocoderResponseMetaData = geocoderResponseMetaData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geocoderResponseMetaData", geocoderResponseMetaData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geocoderResponseMetaData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaDataProperty) == false) {
            return false;
        }
        MetaDataProperty rhs = ((MetaDataProperty) other);
        return new EqualsBuilder().append(geocoderResponseMetaData, rhs.geocoderResponseMetaData).isEquals();
    }

}
