package сontrollers;

import dao.impl.StockDAOImpl;
import entity.Stock;
import services.StockService;

import java.util.List;

public class MainController {

    public MainController(){

    }

    /*public void closeApp() {
        System.out.println("Button exit!");

    }*/

    public void openDirIndeces() {
        System.out.println("Button open INDICES");
    }

    public void openDirStock() {
        StockService stockService = new StockService();
        Stock stock = new Stock();
        stock = stockService.searchStockByTicker("SBER");
        System.out.println(stock.toString());
        List<Stock> stoks = stockService.getAllStocks();
        for (Stock stk:stoks) {
            System.out.println(stk.toString());
        }

        /*StockDAOImpl t = new StockDAOImpl();
        t.readStock();*/
    }

    public void operQUIK() {
        System.out.println("Button QUIK");
    }

    public void docOpen() {
        System.out.println("Button OPEN DOC");
    }

    public void docClose() {
        System.out.println("Button CLOSE DOC");
    }

    public void reportPriceChange() {
        System.out.println("Button REPORT PRICE CHANGE");
    }
}
