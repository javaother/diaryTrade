package services;

import dao.impl.StockDAOImpl;
import entity.Stock;

import java.util.List;

public class StockService {

    private StockDAOImpl stockDAO = new StockDAOImpl();

    public StockService(){}

    public Stock searchStockByTicker(String ticker){
        return stockDAO.searchRecordByKey(ticker);
    }

    public List<Stock> getAllStocks(){
        return stockDAO.getAllTable();
    }
}
