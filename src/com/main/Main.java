/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.db.base.ConnectToDatabase;

/**
 *
 * @author ashif
 */
public class Main {

    public static void main(String[] args) {

        ConnectToDatabase connection = new ConnectToDatabase();

        String sql = "INSERT INTO users (username, city) VALUES (\"robin\", \"ahmed\")";

        connection.getResult(sql);

    }
}
