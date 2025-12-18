package lezione15_DAOv2;

import java.util.List;

public interface GenericDAO<T> {
	boolean create(T entity);
	T readByID(int id);
	List<T> readALL();
	boolean update(T entity);
	boolean delete(int id);
}
