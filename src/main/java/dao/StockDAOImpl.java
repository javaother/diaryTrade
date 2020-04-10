package dao;

import entity.Stock;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class StockDAOImpl implements StockDAO {
    public void findStockByTicker(String tic) {
        System.out.println(HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Stock.class, tic));
    }

    public void readStock() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        System.out.println("Тест акции");
        //List<Stock> stk = new ArrayList<Stock>();
    }
}
