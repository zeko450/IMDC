package com.example.dao;

import com.example.entity.Commentaire;
import com.example.entity.Film;
import jakarta.persistence.EntityTransaction;

public class GestionCommentaireImpl implements IGestionCommentaire{

    DataManager dataManager = null;

    public GestionCommentaireImpl(DataManager dataManager) {this.dataManager = DataManager.getInstanceManager();}


    @Override
    public boolean ajouterCommentaire(Commentaire commentaire) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            dataManager.manager.persist(commentaire);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean modifierCommentaire(int id, Commentaire commentaire) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();


        try{
            Commentaire commentaireExistant = dataManager.manager.find(Commentaire.class,id);
            commentaireExistant = commentaire;
            transaction.commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean supprimerCommentaire(int id) {
        EntityTransaction transaction = dataManager.manager.getTransaction();
        transaction.begin();
        try {
            Commentaire commentaire = dataManager.manager.find(Commentaire.class, id);
            dataManager.manager.remove(commentaire);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }
}
