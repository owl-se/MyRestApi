
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BoundedBy implements Serializable
{

    @SerializedName("Envelope")
    @Expose
    private Envelope envelope;
    private final static long serialVersionUID = 5680545859810675526L;

    public Envelope getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope envelope) {
        this.envelope = envelope;
    }

    public BoundedBy withEnvelope(Envelope envelope) {
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
        if ((other instanceof BoundedBy) == false) {
            return false;
        }
        BoundedBy rhs = ((BoundedBy) other);
        return new EqualsBuilder().append(envelope, rhs.envelope).isEquals();
    }

}
