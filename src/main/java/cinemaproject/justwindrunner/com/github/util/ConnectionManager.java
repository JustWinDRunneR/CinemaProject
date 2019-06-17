package cinemaproject.justwindrunner.com.github.util;

import org.apache.log4j.Logger;
import org.osjava.sj.loader.SJDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {

    private static Logger LOGGER = Logger.getLogger(ConnectionManager.class.getSimpleName());

    public static Connection getConnection() {
        LOGGER.info("Method getConnection starter without parameters");

        Connection connection = null;

        try {
            DataSource dataSource = (SJDataSource) new InitialContext().lookup("db");
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
