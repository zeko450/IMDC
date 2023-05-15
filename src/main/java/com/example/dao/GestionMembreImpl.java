package com.example.dao;

import com.example.entity.Favoris;
import com.example.entity.Film;
import com.example.entity.Membre;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class GestionMembreImpl implements IGestionMembre{

    DataManager dataManager = null;

    public GestionMembreImpl() {
        this.dataManager = DataManager.getInstanceManager();
    }

    @Override
    public boolean ajouteMembre(Membre membre) {

        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            dataManager.manager.persist(membre);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean modifierMembre(int id, Membre membre) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();

        try{
            Membre membreExistant = dataManager.manager.find(Membre.class,id);
            membreExistant = membre;
            transaction.commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean supprimerMembre(int id) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            Membre membre = dataManager.manager.find(Membre.class, id);
            dataManager.manager.remove(membre);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean modifierMdp(Membre membre, String nouveauMP, String dateNaissance) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();

        try{
            if(membre.getDateNaissance().equals(dateNaissance)){
                Membre membreExistant = dataManager.manager.find(Membre.class,membre.getIdPersonne());
                membreExistant.setMotDePasse(nouveauMP);
                transaction.commit();
                return true;
            }
            else {
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }

        return false;
    }

    @Override
    public Membre rechercherMembre(String nomUtilisateur) {
        try {
            Query query = dataManager.manager.createQuery("SELECT M FROM Membre M WHERE M.nomUtilisateur = :nomUtilisateur");
            Membre membre = (Membre) query.getSingleResult();
            return membre;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
