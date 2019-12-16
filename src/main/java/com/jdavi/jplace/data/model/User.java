package com.jdavi.jplace.data.model;

import com.jdavi.jplace.data.enumeration.Role;

import javax.persistence.*;

@Entity
@Table(name = "JPCUSER")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "USER_NAME" )
    private String name;

    @Column( name = "USER_LASTNAME" )
    private String lastname;

    @Column( name = "USER_AGE" )
    private String age;

    @Column( name = "USER_ROLE" )
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Column( name = "USER_GENDER" )
    private String gender;

    @Column( name = "USER_CITY" )
    private String city;

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
