package com.bntu.nadia.electronic_medical_card.model.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "login")
    private String login;

    @Column(name = "encrypted_password")//don't forget :)
    private String password;

    @Column(name = "user_role_id")
    private UserRole userRole;

    @Column(name = "passport_series")//and this)
    private String passportSeries;

    @Column(name = "passport_id")//and
    private String passportId;

    @Column(name = "individual_number")//and
    private String individualNumber;

    @Column(name = "authority_that_issued_passport")//and
    private String authorityThatIssuedPassport;

    @Column(name = "date_of_issue_of_passport")//and this of course)
    private String dateOfIssueOfPassport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(String individualNumber) {
        this.individualNumber = individualNumber;
    }

    public String getAuthorityThatIssuedPassport() {
        return authorityThatIssuedPassport;
    }

    public void setAuthorityThatIssuedPassport(String authorityThatIssuedPassport) {
        this.authorityThatIssuedPassport = authorityThatIssuedPassport;
    }

    public String getDateOfIssueOfPassport() {
        return dateOfIssueOfPassport;
    }

    public void setDateOfIssueOfPassport(String dateOfIssueOfPassport) {
        this.dateOfIssueOfPassport = dateOfIssueOfPassport;
    }
}
