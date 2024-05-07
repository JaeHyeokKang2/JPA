package com.example.jpatest.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Mems {
    @Id
    @Column(name = "member_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    private String username;

    public Mems(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
