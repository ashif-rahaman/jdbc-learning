/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.db.base.ConnectToDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ashif
 */
public class Main {

    public static void main(String[] args) {

        ConnectToDatabase connection = new ConnectToDatabase();

        String sql = "SELECT * FROM users;";

        ResultSet resultSet = connection.getResult(sql);

        System.out.println(ResultSet.CLOSE_CURSORS_AT_COMMIT);
        System.out.println(ResultSet.CONCUR_READ_ONLY);
        System.out.println(ResultSet.CONCUR_UPDATABLE);
        System.out.println(ResultSet.FETCH_FORWARD);
        System.out.println(ResultSet.FETCH_REVERSE);
        System.out.println(ResultSet.TYPE_FORWARD_ONLY);
        System.out.println(ResultSet.TYPE_SCROLL_INSENSITIVE);
        System.out.println(ResultSet.TYPE_SCROLL_SENSITIVE);

        try {
            while (resultSet.next()) {

                System.out.println(resultSet.relative(1));
                System.out.println(resultSet.relative(-1));
            }
        } catch (SQLException ex) {

            System.err.println(ex.toString());
        }

    }
}
