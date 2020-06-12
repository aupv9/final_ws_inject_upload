package com.example.ws.api_ws_final.dao;

import com.example.ws.api_ws_final.config.DataConfig;
import com.example.ws.api_ws_final.dto.User;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UserDao {

    Connection connection=DataConfig.getConnection();

    public UserDao() throws SQLException {
    }
    public User getUserByUserNameAndPassword(User user) throws SQLException {
        Statement statement=connection.createStatement();
        String query="select * from users where username = '"+user.getUserName()+"' and password = '"+user.getPassword()+"";
        ResultSet resultSet=statement.executeQuery(query);

//         String query="select * from users where username = ? and password = ?";
//         PreparedStatement preparedStatement=connection.prepareStatement(query);
//         preparedStatement.setString(1,user.getUserName());
//        ResultSet resultSet=preparedStatement.executeQuery();

        User userRs=new User();
        while (resultSet.next()){
            userRs.setUserName(resultSet.getString(1));
            userRs.setPassword(resultSet.getString(2));
        }
        return userRs;
    }
}
