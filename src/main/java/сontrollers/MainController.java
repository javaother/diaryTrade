package сontrollers;

import dao.StockDAOImpl;

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
        StockDAOImpl t = new StockDAOImpl();
        t.readStock();
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
