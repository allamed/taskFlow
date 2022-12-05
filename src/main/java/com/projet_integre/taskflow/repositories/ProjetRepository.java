package com.projet_integre.taskflow.repositories;

import com.projet_integre.taskflow.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Integer> {
    public List<Projet> findProjetByChef_Id (Integer chefId);



}
