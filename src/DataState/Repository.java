package DataState;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    void add(T entity);
    T save(T entity);

    Optional<T> findById(ID id);
    List<T> findAll();

    T update(ID id, T entity);

    void deleteById(ID id);
}

abstract class BaseRepository<T, ID> implements Repository<T, ID> {

}
