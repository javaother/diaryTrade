package utils;

import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration = AddClassHibernate(configuration);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    /**
     *  Подключение классов-сущностей к Hibernate
     */
    private static Configuration AddClassHibernate(Configuration conf){

        conf.addAnnotatedClass(Balance_series.class);
        conf.addAnnotatedClass(Economic_sector.class);
        conf.addAnnotatedClass(Indicator.class);
        conf.addAnnotatedClass(Indicator_data.class);
        conf.addAnnotatedClass(Indices.class);
        conf.addAnnotatedClass(Indices_distribute.class);
        conf.addAnnotatedClass(Indices_price.class);
        conf.addAnnotatedClass(OutputQUIK.class);
        conf.addAnnotatedClass(Portfolio.class);
        conf.addAnnotatedClass(Stock.class);
        conf.addAnnotatedClass(Stock_distribute.class);
        conf.addAnnotatedClass(Stock_divident.class);
        conf.addAnnotatedClass(Stock_doc.class);
        conf.addAnnotatedClass(Stock_doc_table.class);
        conf.addAnnotatedClass(Stock_price.class);
        conf.addAnnotatedClass(Type_move.class);
        conf.addAnnotatedClass(Type_operation.class);

        return conf;
    }

}
