
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BoundedBy_ implements Serializable
{

    @SerializedName("Envelope")
    @Expose
    private Envelope_ envelope;
    private final static long serialVersionUID = -2729603686633535947L;

    public Envelope_ getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope_ envelope) {
        this.envelope = envelope;
    }

    public BoundedBy_ withEnvelope(Envelope_ envelope) {
        this.envelope = envelope;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("envelope", envelope).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(envelope).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoundedBy_) == false) {
            return false;
        }
        BoundedBy_ rhs = ((BoundedBy_) other);
        return new EqualsBuilder().append(envelope, rhs.envelope).isEquals();
    }

}
