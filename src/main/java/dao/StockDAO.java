package dao;

import entity.Stock;

public interface StockDAO  {

    boolean createRecord();

    boolean deleteRecord();

    Stock searchRecordByKey(String ticker);

    void getAll();
}
