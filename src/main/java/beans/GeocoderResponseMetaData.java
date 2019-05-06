
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GeocoderResponseMetaData implements Serializable
{

    @SerializedName("request")
    @Expose
    private String request;
    @SerializedName("found")
    @Expose
    private String found;
    @SerializedName("results")
    @Expose
    private String results;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy boundedBy;
    private final static long serialVersionUID = 592254795953183873L;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public GeocoderResponseMetaData withRequest(String request) {
        this.request = request;
        return this;
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    public GeocoderResponseMetaData withFound(String found) {
        this.found = found;
        return this;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public GeocoderResponseMetaData withResults(String results) {
        this.results = results;
        return this;
    }

    public BoundedBy getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy boundedBy) {
        this.boundedBy = boundedBy;
    }

    public GeocoderResponseMetaData withBoundedBy(BoundedBy boundedBy) {
        this.boundedBy = boundedBy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("request", request).append("found", found).append("results", results).append("boundedBy", boundedBy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(boundedBy).append(results).append(request).append(found).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeocoderResponseMetaData) == false) {
            return false;
        }
        GeocoderResponseMetaData rhs = ((GeocoderResponseMetaData) other);
        return new EqualsBuilder().append(boundedBy, rhs.boundedBy).append(results, rhs.results).append(request, rhs.request).append(found, rhs.found).isEquals();
    }

}
