package com.varoli.hello.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String username;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonBackReference(value = "users_donation")
    private List<Donation> donations;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonBackReference(value = "user_user_preference")
    private UserPreference userPreference;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_ong",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ong_id", referencedColumnName = "id"))
    private Set<Ong> ongs;

    public User() {
        this.donations = new ArrayList<>();
        this.ongs = new HashSet<>();
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Ong> getOngs() {
        return ongs;
    }

    public void setOngs(Set<Ong> ongs) {
        this.ongs = ongs;
    }

    public UserPreference getUserPreference() {
        return userPreference;
    }

    public void setUserPreference(UserPreference userPreference) {
        this.userPreference = userPreference;
    }
}
