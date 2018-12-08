package com.JDBC.DBUtil;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Connection con=    DBUtil.getConnection();
if(con!=null) {
	System.out.println("Conneted");
	
}
    
    }
}
