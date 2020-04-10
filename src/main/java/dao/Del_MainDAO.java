package dao;

interface Del_MainDAO {

    boolean createRecord();
    boolean deleteRecord();
    <T, V> T searchRecordByKey(V v);
    void getAll();
}
