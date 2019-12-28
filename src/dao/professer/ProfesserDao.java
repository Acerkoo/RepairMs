package dao.professer;

import java.util.List;

public interface ProfesserDao {

    public void insertProfesser(Professer professer);
    public void deleteProfesser(String task);
    public List queryAllProfesses();
}
