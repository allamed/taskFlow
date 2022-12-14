package com.projet_integre.taskflow.services;

import com.projet_integre.taskflow.entities.Projet;
import com.projet_integre.taskflow.entities.Utilisateur;

import java.util.List;

public interface IProjetService {
    public Projet creerProjet(String nom, Utilisateur chef);
    public Projet creerProjet(String nom, Utilisateur chef , List<Utilisateur> membres);
    public void supprimerProjet(Projet projet);
    public List<Projet> getProjetByChef(Utilisateur chef);


}
