
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GeoObject implements Serializable
{

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty_ metaDataProperty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy_ boundedBy;
    @SerializedName("Point")
    @Expose
    private Point point;
    private final static long serialVersionUID = -1644539308624677898L;

    public MetaDataProperty_ getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty_ metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public GeoObject withMetaDataProperty(MetaDataProperty_ metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeoObject withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeoObject withName(String name) {
        this.name = name;
        return this;
    }

    public BoundedBy_ getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy_ boundedBy) {
        this.boundedBy = boundedBy;
    }

    public GeoObject withBoundedBy(BoundedBy_ boundedBy) {
        this.boundedBy = boundedBy;
        return this;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public GeoObject withPoint(Point point) {
        this.point = point;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metaDataProperty", metaDataProperty).append("description", description).append("name", name).append("boundedBy", boundedBy).append("point", point).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(point).append(boundedBy).append(metaDataProperty).append(description).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeoObject) == false) {
            return false;
        }
        GeoObject rhs = ((GeoObject) other);
        return new EqualsBuilder().append(point, rhs.point).append(boundedBy, rhs.boundedBy).append(metaDataProperty, rhs.metaDataProperty).append(description, rhs.description).append(name, rhs.name).isEquals();
    }

}
