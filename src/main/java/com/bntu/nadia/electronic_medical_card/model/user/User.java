package com.bntu.nadia.electronic_medical_card.model.user;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalCard;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements UserDetails {

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
    private String username;

    @Column(name = "encrypted_password")
    private String password;

//    @Column(name = "user_role_id")
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

//    @Column(name = "active")
//    private boolean active;

    @Transient
    private String passwordConfirm;

    @Transient
    @OneToOne(mappedBy = "patient")
    private MedicalCard medicalCard;

    public User(){}

    public User(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

//    @Column(name = "passport_series")//and this)
//    private String passportSeries;
//
//    @Column(name = "passport_id")//and
//    private String passportId;
//
//    @Column(name = "individual_number")//and
//    private String individualNumber;
//
//    @Column(name = "authority_that_issued_passport")//and
//    private String authorityThatIssuedPassport;
//
//    @Column(name = "date_of_issue_of_passport")//and this of course)
//    private Calendar dateOfIssueOfPassport;

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

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {

        if (roles == null) {
            roles = new HashSet<>();
        }

        roles.add(role);
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

//    public boolean isActive() {
//        return active;
//    }
//
//    public void setActive(boolean active) {
//        this.active = active;
//    }

    //    public String getPassportSeries() {
//        return passportSeries;
//    }
//
//    public void setPassportSeries(String passportSeries) {
//        this.passportSeries = passportSeries;
//    }
//
//    public String getPassportId() {
//        return passportId;
//    }
//
//    public void setPassportId(String passportId) {
//        this.passportId = passportId;
//    }
//
//    public String getIndividualNumber() {
//        return individualNumber;
//    }
//
//    public void setIndividualNumber(String individualNumber) {
//        this.individualNumber = individualNumber;
//    }
//
//    public String getAuthorityThatIssuedPassport() {
//        return authorityThatIssuedPassport;
//    }
//
//    public void setAuthorityThatIssuedPassport(String authorityThatIssuedPassport) {
//        this.authorityThatIssuedPassport = authorityThatIssuedPassport;
//    }
//
//    public Calendar getDateOfIssueOfPassport() {
//        return dateOfIssueOfPassport;
//    }
//
//    public void setDateOfIssueOfPassport(Calendar dateOfIssueOfPassport) {
//        this.dateOfIssueOfPassport = dateOfIssueOfPassport;
//    }
}
