/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import tac.db.DbContract;

/**
 *
 * @author eisne
 */
public class TestConnection {
    public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection(
					DbContract.HOST+DbContract.DB_NAME,
					DbContract.USERNAME,
					DbContract.PASSWORD);
			
			System.out.println("DB connected");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
                

	}
}
