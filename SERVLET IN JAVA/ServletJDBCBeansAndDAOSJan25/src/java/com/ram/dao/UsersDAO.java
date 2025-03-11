/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.dao;

import com.ram.bean.UsersBean;
import com.ram.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsersDAO {
static Connection conn;
public int registerUser(UsersBean ub){
    int r=0;
    //step1:
    //step2:
    conn=ConnectionPool.connectDB();
    //step3:
    String sql="insert into users values('"+ub.getUid()+"','"+ub.getName()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobile()+"')";
    try {
        //step4:
        Statement stmt=conn.createStatement();
        //step5:
        r=stmt.executeUpdate(sql);
        //step6:
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return r;
            
}
public int loginCheck(String userName,String password){
    int id=0;
    conn=ConnectionPool.connectDB();
    String sql="select uid from users where username='"+userName+"' and password='"+password+"'";
    try {
        Statement stmt=conn.createStatement();
        
        ResultSet rs=stmt.executeQuery(sql);
        if(rs.next()){
            id=rs.getInt("uid");
        }
        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    return id;

}
    public static void main(String[] args) {
        //1. call registerUser()
//        UsersBean ub=new UsersBean();
//        ub.setUid(101);
//        ub.setName("Ram");
//        ub.setUsername("Ram123");
//        ub.setPassword("1234");
//        ub.setEmail("ram@gmail.com");
//        ub.setMobile("7648904739");
//        
//        UsersDAO ud=new UsersDAO();
//        int r=ud.registerUser(ub);
//        if(r>0){
//            System.out.println("Registration success");
//        }else{
//            System.out.println("Registration fail");
//        }
//        
UsersDAO ud=new UsersDAO();
int r=ud.loginCheck("Ram123", "1234");
if(r>0){
    System.out.println("Login Success");
}else{
    System.out.println("Login Fail");
}
    }
}
