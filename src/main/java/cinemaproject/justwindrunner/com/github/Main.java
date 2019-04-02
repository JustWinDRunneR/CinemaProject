package cinemaproject.justwindrunner.com.github;

import org.apache.log4j.Logger;
import org.osjava.sj.loader.SJDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Project started");
        try {
            DataSource dataSource = (SJDataSource) new InitialContext().lookup("db");
            Connection connection = dataSource.getConnection();

            String query = "SELECT * FROM cinema.movie;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            System.out.println(resultSet.getString("title"));

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        LOGGER.warn("Project end");

    }
}

