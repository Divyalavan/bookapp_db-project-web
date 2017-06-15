package com.revature.divya;

import java.sql.Connection;

import com.divya.util.ConnectionUtil;

public class TestConnectionUtil {

	public static void main(String[] args) throws Exception {
        
        Connection con = ConnectionUtil.getConnection();
        System.out.println("Connection:" + con);
 
    }
 


}
