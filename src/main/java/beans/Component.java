
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Component implements Serializable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("name")
    @Expose
    private String name;
    private final static long serialVersionUID = 7712038942466488899L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Component withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Component withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kind", kind).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(kind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Component) == false) {
            return false;
        }
        Component rhs = ((Component) other);
        return new EqualsBuilder().append(name, rhs.name).append(kind, rhs.kind).isEquals();
    }

}
