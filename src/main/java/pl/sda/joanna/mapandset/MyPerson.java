package pl.sda.joanna.mapandset;

import java.time.LocalDate;

public class MyPerson {
    private String firstName;
    private String lastName;
    private String peselNumber;
    private LocalDate dateOfBirth;

    public MyPerson(String firstName, String lastName, String peselNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}


