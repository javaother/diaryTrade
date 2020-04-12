package services;

import dao.impl.StockDAOImpl;
import entity.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockService {

    private StockDAOImpl stockDAO = new StockDAOImpl();

    public StockService() {
    }

    public boolean createStock(Stock stock) {
        return stockDAO.createRecord(stock);
        //return true;
    }

    public boolean updateStock(Stock stock){
        return stockDAO.updateRecord(stock);
    }

    public boolean deleteStock(Stock stock){
        return stockDAO.deleteRecord(stock);
    }

    public Stock searchStockByTicker(String ticker){
        return stockDAO.searchRecordByKey(ticker);
    }

    public List<Stock> getAllStocks(){
        return stockDAO.getAllTable();
    }
}
