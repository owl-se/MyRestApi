
package beans;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GeoObjectCollection implements Serializable
{

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty metaDataProperty;
    @SerializedName("featureMember")
    @Expose
    private List<FeatureMember> featureMember = null;
    private final static long serialVersionUID = 4820424176544189529L;

    public MetaDataProperty getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public GeoObjectCollection withMetaDataProperty(MetaDataProperty metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
        return this;
    }

    public List<FeatureMember> getFeatureMember() {
        return featureMember;
    }

    public void setFeatureMember(List<FeatureMember> featureMember) {
        this.featureMember = featureMember;
    }

    public GeoObjectCollection withFeatureMember(List<FeatureMember> featureMember) {
        this.featureMember = featureMember;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metaDataProperty", metaDataProperty).append("featureMember", featureMember).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(metaDataProperty).append(featureMember).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoObjectCollection) == false) {
            return false;
        }
        GeoObjectCollection rhs = ((GeoObjectCollection) other);
        return new EqualsBuilder().append(metaDataProperty, rhs.metaDataProperty).append(featureMember, rhs.featureMember).isEquals();
    }

}
