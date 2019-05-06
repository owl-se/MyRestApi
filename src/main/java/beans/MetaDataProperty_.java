
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MetaDataProperty_ implements Serializable
{

    @SerializedName("GeocoderMetaData")
    @Expose
    private GeocoderMetaData geocoderMetaData;
    private final static long serialVersionUID = 765855886682584980L;

    public GeocoderMetaData getGeocoderMetaData() {
        return geocoderMetaData;
    }

    public void setGeocoderMetaData(GeocoderMetaData geocoderMetaData) {
        this.geocoderMetaData = geocoderMetaData;
    }

    public MetaDataProperty_ withGeocoderMetaData(GeocoderMetaData geocoderMetaData) {
        this.geocoderMetaData = geocoderMetaData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("geocoderMetaData", geocoderMetaData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geocoderMetaData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaDataProperty_) == false) {
            return false;
        }
        MetaDataProperty_ rhs = ((MetaDataProperty_) other);
        return new EqualsBuilder().append(geocoderMetaData, rhs.geocoderMetaData).isEquals();
    }

}
