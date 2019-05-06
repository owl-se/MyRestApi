
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Envelope implements Serializable
{

    @SerializedName("lowerCorner")
    @Expose
    private String lowerCorner;
    @SerializedName("upperCorner")
    @Expose
    private String upperCorner;
    private final static long serialVersionUID = 2321895228836985293L;

    public String getLowerCorner() {
        return lowerCorner;
    }

    public void setLowerCorner(String lowerCorner) {
        this.lowerCorner = lowerCorner;
    }

    public Envelope withLowerCorner(String lowerCorner) {
        this.lowerCorner = lowerCorner;
        return this;
    }

    public String getUpperCorner() {
        return upperCorner;
    }

    public void setUpperCorner(String upperCorner) {
        this.upperCorner = upperCorner;
    }

    public Envelope withUpperCorner(String upperCorner) {
        this.upperCorner = upperCorner;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lowerCorner", lowerCorner).append("upperCorner", upperCorner).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lowerCorner).append(upperCorner).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Envelope) == false) {
            return false;
        }
        Envelope rhs = ((Envelope) other);
        return new EqualsBuilder().append(lowerCorner, rhs.lowerCorner).append(upperCorner, rhs.upperCorner).isEquals();
    }

}
