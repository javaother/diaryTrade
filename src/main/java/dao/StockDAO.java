package dao;

interface StockDAO {
    public void readStock();

    public void findStockByTicker(String tic);
}
