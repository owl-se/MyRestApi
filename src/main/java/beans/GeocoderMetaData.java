
package beans;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GeocoderMetaData implements Serializable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("AddressDetails")
    @Expose
    private AddressDetails addressDetails;
    private final static long serialVersionUID = -3359458408491368381L;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public GeocoderMetaData withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GeocoderMetaData withText(String text) {
        this.text = text;
        return this;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public GeocoderMetaData withPrecision(String precision) {
        this.precision = precision;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public GeocoderMetaData withAddress(Address address) {
        this.address = address;
        return this;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public GeocoderMetaData withAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kind", kind).append("text", text).append("precision", precision).append("address", address).append("addressDetails", addressDetails).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(addressDetails).append(precision).append(address).append(kind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeocoderMetaData) == false) {
            return false;
        }
        GeocoderMetaData rhs = ((GeocoderMetaData) other);
        return new EqualsBuilder().append(text, rhs.text).append(addressDetails, rhs.addressDetails).append(precision, rhs.precision).append(address, rhs.address).append(kind, rhs.kind).isEquals();
    }

}
