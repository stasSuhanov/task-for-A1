package com.company.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        String file2 = "src\\logins.csv";
        BufferedReader reader2 = null;
        String line2 = "";
        List<Login> list = new ArrayList<>();
        try {
            reader2 = new BufferedReader(new FileReader((file2)));
            while((line2 = reader2.readLine()) != null){
                String[] row = line2.split(",");
                list.add(new Login(row[0],row[1],row[2],row[3],row[4]));
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                reader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try{
            String url = "jdbc:mysql://localhost/task?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){
                String sql = "INSERT Logins(Application, AppAccountName, IsActive, JobTitle, Department) VALUES (?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                for (int i = 0; i < list.size(); i++) {
                    Login ob = list.get(i);
                    statement.setString(1, ob.getApplication());
                    statement.setString(2, ob.getAppAccountName());
                    statement.setString(3, ob.getIsActive());
                    statement.setString(4, ob.getJobTitle());
                    statement.setString(5, ob.getDepartment());
                    statement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
