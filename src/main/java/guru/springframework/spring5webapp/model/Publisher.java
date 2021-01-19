package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publisher {
    private String publisherId;

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    @Id
    public String getPublisherId() {
        return publisherId;
    }

    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;

    @Override
    public boolean equals(Object input)
    {
        Publisher publisher = (Publisher) input;
        boolean match = false;
        if (publisher == null) return match;
        if (publisher.publisherId == this.publisherId && publisher.addressLine1.equals(this.addressLine1)
        && publisher.city.equals(this.city) && publisher.state.equals(this.state) && publisher.name.equals(this.name) && publisher.zip.equals(this.zip))
        {
            match = true;
        }
        return match;
    }
    @Override
    public String toString() {
        return this.name + " " + this.addressLine1 + " " +  this.city + this.state + " " + this.zip;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31 * result + name.hashCode();
        result = 31 * result + publisherId.hashCode();
        result = 31 * result + addressLine1.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + zip.hashCode();
        return result;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }



}
