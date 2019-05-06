
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class YandexMaps implements Serializable
{

    @SerializedName("response")
    @Expose
    private Response response;
    private final static long serialVersionUID = -6455492706842708618L;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public YandexMaps withResponse(Response response) {
        this.response = response;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("response", response).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(response).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof YandexMaps) == false) {
            return false;
        }
        YandexMaps rhs = ((YandexMaps) other);
        return new EqualsBuilder().append(response, rhs.response).isEquals();
    }

}
