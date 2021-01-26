/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tatangsulaeman.latihanmvcjdbc.database;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.tatangsulaeman.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.tatangsulaeman.latihanmvcjdbc.service.PelangganDao;

/**
 *
 * @author amtat
 * Nama : Tatang Sulaeman
 * Kelas : IF2
 * NIM :10119068
 */
public class KingsBarbershopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl((com.mysql.jdbc.Connection) getConnection());
        }
        return pelangganDao;
    }
}
