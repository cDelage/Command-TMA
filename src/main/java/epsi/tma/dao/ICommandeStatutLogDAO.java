/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.tma.dao;

import epsi.tma.entity.CommandeStatutLog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Map;

/**
 *
 * @author utilisateur
 */
public interface ICommandeStatutLogDAO {
    
    public Map<String,Object> read();
    //public CommandeStatutLog loadFromResultSet(ResultSet rs) throws SQLException;
    // public String create(String emmeteur, String action, int idCommande, Timestamp horodatage, int idProduit);
    
}
