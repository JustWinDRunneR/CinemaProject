package cinemaproject.justwindrunner.com.github.dao.interfaces;

public interface UserDao<User, Integer> extends Dao<User, Integer> {

    User readByEmail(String mail);

}
