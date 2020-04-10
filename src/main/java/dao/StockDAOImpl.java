package dao;

import entity.Stock;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class StockDAOImpl implements MainDAO {

    public void findStockByTicker(String tic) {
        System.out.println(HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Stock.class, tic));
    }

    public void readStock() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        System.out.println("Тест акции");
        //List<Stock> stk = new ArrayList<Stock>();
    }

    @Override
    public boolean createRecord() {
        return false;
    }

    @Override
    public boolean deleteRecord() {
        return false;
    }

    @Override
    public void searchRecordByKey() {

    }

    @Override
    public void getAll() {

    }
}
