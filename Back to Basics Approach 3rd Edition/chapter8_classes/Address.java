package chapter8_classes;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 6:10 PM
 */
class Address {
  private String city;
  private String state;
  private String country;
  private String zipcode;

  public Address(String city, String state, String country, String zipcode) {
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipcode = zipcode;
  }

  @Override
  public String toString() {
    return "Address{" +
           "city='" + city + '\'' +
           ", state='" + state + '\'' +
           ", country='" + country + '\'' +
           ", zipcode='" + zipcode + '\'' +
           '}';
  }
}
