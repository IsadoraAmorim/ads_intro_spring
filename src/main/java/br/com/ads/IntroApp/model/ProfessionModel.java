package br.com.ads.IntroApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "professions")
public class ProfessionModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private long id;

    @Column(length = 50, nullable = false)
    @Setter @Getter
    private String name;
}