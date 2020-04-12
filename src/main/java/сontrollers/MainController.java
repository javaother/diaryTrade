package сontrollers;

import entity.Economic_sector;
import entity.Stock;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.StockService;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    TableView<Stock> stockTable;

    public MainController(){/*constructor*/  }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeStockTable();
    }

    public void openDirIndeces() {
        System.out.println("Button open INDICES");
    }

    public void openDirStock() {
        System.out.println("Button Stock");
        //StockService stockService = new StockService();
        /*//create
        Stock stk = new Stock("std", "stud", new Date());
        System.out.println(stockService.createStock(stk));*/
        /*//search by Ticker
        Stock stock = new Stock();
        stock = stockService.searchStockByTicker("std");*/
        /*//update
        stock.setName("stud2");
        System.out.println(stockService.updateStock(stock));*/
        //delete
       // System.out.println(stockService.deleteStock(stock));


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

    //initialize
    public void initializeStockTable() {
        ObservableList<Stock> stockList = FXCollections.observableArrayList();

        //stockList.addAll(new Person("Alex", "Alex@gmail.com"), new Person("Bob", "Bob@gmail.com"));
        stockList.addAll(getAllStocks());

        TableColumn<Stock, String> tcTicker = new TableColumn<>("Тикер");
        tcTicker.setCellValueFactory(new PropertyValueFactory<Stock, String>("ticker"));

        TableColumn<Stock, String> tcName = new TableColumn<>("Наименование");
        tcName.setCellValueFactory(new PropertyValueFactory<Stock, String>("name"));

        TableColumn<Stock, Economic_sector> tcSector = new TableColumn<>("Сектор");
        tcSector.setCellValueFactory(new PropertyValueFactory<Stock, Economic_sector>("sector"));

        TableColumn<Stock, Date> tcDate = new TableColumn<>("Дата");
        tcDate.setCellValueFactory(new PropertyValueFactory<Stock, Date>("dateCreate"));

        stockTable.getColumns().addAll(tcTicker, tcName, tcSector, tcDate);
        stockTable.setItems(stockList);
    }

    private List getAllStocks() {
        StockService stockService = new StockService();

        //System.out.println(stock.toString());
        /*List<Stock> stocks = stockService.getAllStocks();
        for (Stock stk : stocks) {
            System.out.println(stk.toString());
        }*/
        return stockService.getAllStocks();
    }
}
