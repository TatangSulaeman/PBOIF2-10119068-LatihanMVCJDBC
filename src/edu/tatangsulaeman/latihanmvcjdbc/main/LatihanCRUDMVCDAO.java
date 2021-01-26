/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tatangsulaeman.latihanmvcjdbc.main;

import edu.tatangsulaeman.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.tatangsulaeman.latihanmvcjdbc.entity.Pelanggan;
import edu.tatangsulaeman.latihanmvcjdbc.error.PelangganException;
import edu.tatangsulaeman.latihanmvcjdbc.service.PelangganDao;
import edu.tatangsulaeman.latihanmvcjdbc.view.MainViewPelanggan;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 *
 * @author amtat
 * Nama : Tatang Sulaeman
 * Kelas : IF2
 * NIM :10119068
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                try {
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (PelangganException ex) {
                    java.util.logging.Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
            }
        });
        
    }
    
}
