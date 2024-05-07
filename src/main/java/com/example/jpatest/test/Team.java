package com.example.jpatest.test;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Team {
    @Id
    @Column(name = "TEAM_ID")
    private String id;
    private String name;
}
