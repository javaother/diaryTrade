package dao;

import entity.Stock;

import java.util.List;

public interface StockDAO  {

    boolean createRecord();

    boolean deleteRecord();

    Stock searchRecordByKey(String ticker);

    List<Stock> getAllTable();
}
