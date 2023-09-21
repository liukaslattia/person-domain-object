import java.util.Objects;

/**
 * Person for an imaginary database
 */
public class Person {
    private final int socialSecurityNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String nationality;
    private final String nativeLanguage;
    private String socialStatus;
    private final int dateOfBirth;
    private int dateOfDeath;

    private int partnerSocialSecurityNumber;


    @Override
    public String toString() {
        return "Person{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfDeath=" + dateOfDeath +
                ", partnerSocialSecurityNumber=" + partnerSocialSecurityNumber +
                '}';
    }

    // Constructor
    public Person(int socialSecurityNumber,
                  String firstName,
                  String lastName,
                  String address,
                  String nationality,
                  String nativeLanguage,
                  String socialStatus,
                  int dateOfBirth) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.nationality = nationality;
        this.nativeLanguage = nativeLanguage;
        this.socialStatus = socialStatus;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter and setter methods

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getDateOfDeath() {
        return dateOfDeath;
    }

    public int getPartnerSocialSecurityNumber() {
        return partnerSocialSecurityNumber;
    }

    public void setPartnerSocialSecurityNumber(int partnerSocialSecurityNumber) {
        this.partnerSocialSecurityNumber = partnerSocialSecurityNumber;
    }

    // Methods
    public String setDateOfDeath(int dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        if (Objects.equals(this.socialStatus, "Married")) {
            //  get partner from database based on partnerSocialSecurityNumber
            //  set partners socialStatus to "Widow"
            return this.firstName + " has died and social security number " + this.partnerSocialSecurityNumber +
                    " holder is now a widow.";
        }
        return this.firstName + " died alone.";

    }

    public String married(Person partner) {
        this.partnerSocialSecurityNumber = partner.socialSecurityNumber;
        partner.setPartnerSocialSecurityNumber(this.partnerSocialSecurityNumber);
        this.socialStatus = "Married";
        partner.setSocialStatus("Married");
        return this.firstName + " married " + partner.getFirstName();

    }

}
