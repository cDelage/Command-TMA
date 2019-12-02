/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.tma.service;

import epsi.tma.entity.Commande;
import java.util.List;

/**
 *
 * @author florentin
 */
public interface ICommandeService {

    public int create(int pIdProduit, int pIdMagasin, int pIdEntrepot, int pIdEtat);

    public String update(int newState, int idCommand);
    
    public String updateAll(int oldState, int newState);
    
    public String updateCommand(int newState, int idCommand);
    
    public String updateAllCommand(int oldState, int newState);

    public List<Commande> read();

    public void clear();

    public void clearTodayStatus();

    public String simulateMagasinCommande(int idProduit, int idMagasin, int idEntrepot);
}
