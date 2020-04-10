package dao.impl;

import dao.StockDAO;
import entity.Stock;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class StockDAOImpl implements StockDAO {

    /*public void findStockByTicker(String tic) {
       // System.out.println(HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Stock.class, tic));
    }

    public void readStock() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        System.out.println("Тест акции");
        //List<Stock> stk = new ArrayList<Stock>();
    }*/

    @Override
    public boolean createRecord() {
        return false;
    }

    @Override
    public boolean deleteRecord() {
        return false;
    }

    @Override
    public Stock searchRecordByKey(String ticker) {
        Session ses = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        // HQL (Hibernate Query Language)
        /*String sql = "From " + Stock.class.getSimpleName() + " Where ticker = '" + ticker + "'";
        System.out.println("sql = " + sql);

        Stock stock = (Stock) ses.createQuery(sql).getSingleResult();*/
        return ses.get(Stock.class, ticker);
        //return stock;
    }

    @Override
    public void getAll() {

    }
}
