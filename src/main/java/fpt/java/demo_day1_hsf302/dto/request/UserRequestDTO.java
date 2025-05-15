package fpt.java.demo_day1_hsf302.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import fpt.java.demo_day1_hsf302.dto.validator.EnumPattern;
import fpt.java.demo_day1_hsf302.dto.validator.EnumValue;
import fpt.java.demo_day1_hsf302.dto.validator.GenderSubset;
import fpt.java.demo_day1_hsf302.dto.validator.PhoneNumber;
import fpt.java.demo_day1_hsf302.util.Gender;
import fpt.java.demo_day1_hsf302.util.UserStatus;
import fpt.java.demo_day1_hsf302.util.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import static fpt.java.demo_day1_hsf302.util.Gender.*;

public class UserRequestDTO implements Serializable {

    @NotBlank(message = "not blank")
    private String firstName;

    @NotNull(message = "not null")
    private String lastName;

    @Email(message = "Email must format")
    private String email;

    @PhoneNumber(message = "Phone must format")
    private String phone;

    @NotNull(message = "not null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date dateOfBirth;

    @GenderSubset(anyOf = {MALE, FEMALE, OTHER})
    private Gender gender;

    @NotNull(message = "Not null")
    private String username;

    @NotNull(message = "Password not null")
    private String password;

    @NotNull( message = "Type not null")
    @EnumValue(name = "type",enumClass = UserType.class)
    private String type;

    @NotEmpty(message = "addresses can not empty")
    private Set<Address> addresses;

    @EnumPattern(name = "status", regexp = "ACTIVE|INACTIVE|NONE")
    private UserStatus status;

    public UserRequestDTO() {
    }

    public UserRequestDTO(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public static class Address {
        private String apartmentNumber;
        private String floor;
        private String building;
        private String streetNumber;
        private String street;
        private String city;
        private String country;
        private int addressType;

        public String getApartmentNumber() {
            return apartmentNumber;
        }

        public void setApartmentNumber(String apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }

        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getBuilding() {
            return building;
        }

        public void setBuilding(String building) {
            this.building = building;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public void setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getAddressType() {
            return addressType;
        }

        public void setAddressType(int addressType) {
            this.addressType = addressType;
        }


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
