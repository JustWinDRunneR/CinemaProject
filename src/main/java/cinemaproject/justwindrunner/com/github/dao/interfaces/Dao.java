package cinemaproject.justwindrunner.com.github.dao.interfaces;

public interface Dao<Entity, Integer> {

    boolean create(Entity entity);
    Entity read(Integer entityId);
    boolean update(Entity entity);
    boolean delete(Integer entityId);

}
