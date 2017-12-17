/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db.tables;

/**
 *
 * @author ashif
 */
public class Users {

    private int id;
    private String name;
    private String city;

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", name=" + name + ", city=" + city + '}';
    }
}
