package dao;

import entity.Stock;

interface StockDAO {
    public void readStock();

    public void findStockByTicker(String tic);
}
