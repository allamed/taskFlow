package com.projet_integre.taskflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @Data  @NoArgsConstructor
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contenu;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Commentaire(String contenu) {
        this.contenu = contenu;
        this.date=new Date();
    }
}
