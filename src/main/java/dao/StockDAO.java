package dao;

import entity.Stock;

import java.util.List;

public interface StockDAO  {

    boolean createRecord(Stock stock);

    boolean updateRecord(Stock stock);

    boolean deleteRecord(Stock stock);

    Stock searchRecordByKey(String ticker);

    List<Stock> getAllTable();
}
