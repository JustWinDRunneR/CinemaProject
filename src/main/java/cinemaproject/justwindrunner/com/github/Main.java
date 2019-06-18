package cinemaproject.justwindrunner.com.github;

import cinemaproject.justwindrunner.com.github.dao.entities.User;
import cinemaproject.justwindrunner.com.github.util.ConnectionManager;
import cinemaproject.justwindrunner.com.github.util.QueriesManager;
import org.apache.log4j.Logger;
import org.osjava.sj.loader.SJDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Properties properties = QueriesManager.getProperties("user");
        System.out.println(properties.getProperty("insert"));

//        LOGGER.info("Project started");
//        try {
//            /*DataSource dataSource = (SJDataSource) new InitialContext().lookup("db");
//            Connection connection = dataSource.getConnection();*/
//
//            Connection connection = ConnectionManager.getConnection();
//
//            String query = "SELECT * FROM cinema.movie;";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            resultSet.next();
//
//            System.out.println(resultSet.getString("title"));
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        LOGGER.warn("Project end");
    }
}

