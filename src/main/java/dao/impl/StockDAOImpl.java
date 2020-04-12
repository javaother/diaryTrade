package dao.impl;

import dao.StockDAO;
import entity.Stock;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class StockDAOImpl implements StockDAO {

    public StockDAOImpl(){}

    @Override
    public boolean createRecord(Stock stock){
        Session session = HibernateSessionFactoryUtil.getSession();
        session.beginTransaction();
        //Stock stockControl = searchRecordByKey(stockNew.getTicker());
        if (searchRecordByKey(stock.getTicker()) == null) {
            session.save(stock);
            //session.flush();
            session.getTransaction().commit();
            return true;
        }
        //student.setId(null); // добавить новую запись, а не изменить существующую

        return false;
    }

    @Override
    public boolean updateRecord(Stock stock) {
        if (stock == null){
            return false;
        }
        Session session = HibernateSessionFactoryUtil.getSession();
        //Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(stock);
        //session.flush();
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deleteRecord(Stock stock) {
        if (stock == null){
            return false;
        }
        Session session = HibernateSessionFactoryUtil.getSession();
        session.beginTransaction();
        session.delete(stock);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Stock searchRecordByKey(String ticker) {
        Session session = HibernateSessionFactoryUtil.getSession();
        Stock stock = session.get(Stock.class, ticker);
        session.close();
        return stock;
    }

    @Override
    public List<Stock> getAllTable() {
        Session session = HibernateSessionFactoryUtil.getSession();
        session.beginTransaction();
        List<Stock> stocks = new ArrayList<Stock>
                (session.createQuery("from " + Stock.class.getSimpleName()).list());
        session.getTransaction().commit();
        return stocks;
    }

   /* private Session getSession() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }*/
}
