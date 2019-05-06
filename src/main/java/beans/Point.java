
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Point implements Serializable
{

    @SerializedName("pos")
    @Expose
    private String pos;
    private final static long serialVersionUID = -5627964615963358249L;

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Point withPos(String pos) {
        this.pos = pos;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pos", pos).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pos).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Point) == false) {
            return false;
        }
        Point rhs = ((Point) other);
        return new EqualsBuilder().append(pos, rhs.pos).isEquals();
    }

}
