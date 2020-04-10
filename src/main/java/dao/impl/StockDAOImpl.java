package dao.impl;

import dao.StockDAO;
import entity.Stock;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.util.ArrayList;
import java.util.List;

public class StockDAOImpl implements StockDAO {

    public StockDAOImpl(){}

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
        return getSession().get(Stock.class, ticker);
    }

    @Override
    public List<Stock> getAllTable() {
        Session session = getSession();
        session.beginTransaction();
        List<Stock> stocks = new ArrayList<Stock>
                (session.createQuery("from " + Stock.class.getSimpleName()).list());
        session.getTransaction().commit();
        return stocks;
    }

    private Session getSession() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }
}
