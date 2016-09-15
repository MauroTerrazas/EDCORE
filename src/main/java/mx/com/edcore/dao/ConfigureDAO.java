package mx.com.edcore.dao;

import java.util.List;
import mx.com.edcore.util.HibernateUtil;
import mx.com.edcore.vo.sql.SQL0002;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ConfigureDAO {
    
    static public List<SQL0002> getOffices(String sql, Integer displaylength, Integer displaystart){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.getCurrentSession();
        sesion.getTransaction().begin();
        Query query = sesion.createSQLQuery(sql).addEntity(SQL0002.class);
        query.setMaxResults(displaylength);
        query.setFirstResult(displaystart);
        List<SQL0002> list = query.list();
        sesion.getTransaction().commit();
        return list;
    }
    
}
