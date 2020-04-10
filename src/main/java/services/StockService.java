package services;

import dao.impl.StockDAOImpl;
import entity.Stock;

public class StockService {

    private StockDAOImpl stockDAO = new StockDAOImpl();

    public StockService(){}

    public Stock searchStockByTicker(String ticker){
        return stockDAO.searchRecordByKey(ticker);
    }
}
