package Exercise.three;

/**
 * This class will hold the address of member
 */
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postcode;
    private String country;

    /**
     * The constructor will create new address of the member by
     * initialising the address values
     * @param line1 Address line one
     * @param line2 Address line 2 if line 1 can  not contain it
     * @param city the city of the address
     * @param state the state of the address
     * @param postcode The post code
     * @param country The country of the address
     */
    public Address(String line1, String line2, String city, String state, String postcode, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
    }

    /**
     * Getter to get the line 1 of the member address
     * @return line one of the member address
     */
    public String getLine1() {
        return line1;
    }

    /**
     * This is used to update the member's address line 1
     * @param line1 will return the line 1 of the member's address line 1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    /**
     * Getter to get the line 2 of the member address
     * @return line one of the member address
     */
    public String getLine2() {
        return line2;
    }
    /**
     * This is used to update the member's address line 1
     * @param line2 will return the line 1 of the member's address line 2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }
    /**
     * Getter to get city of the member address
     * @return city one of the member address
     */
    public String getCity() {
        return city;
    }
    /**
     * This is used to update the member's city
     * @param city will return the line 1 of the member's city
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * Getter to get state of the member address
     * @return state one of the member address
     */
    public String getState() {
        return state;
    }
    /**
     * This is used to update the member's state
     * @param state will return the line 1 of the member's state
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * Getter to get postcode of the member address
     * @return postcode one of the member address
     */
    public String getPostcode() {
        return postcode;
    }
    /**
     * This is used to update the member's postcode
     * @param postcode will return the line 1 of the member's postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    /**
     * Getter to get country of the member address
     * @return country one of the member address
     */
    public String getCountry() {
        return country;
    }
    /**
     * This is used to update the member's country
     * @param country will return the line 1 of the member's country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postcode='" + postcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
