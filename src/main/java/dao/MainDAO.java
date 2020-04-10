package dao;

public interface MainDAO {

    boolean createRecord();
    boolean deleteRecord();
    void searchRecordByKey();
    void getAll();
}
