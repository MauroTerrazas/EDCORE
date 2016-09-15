package mx.com.edcore.dao;

import java.util.List;
import mx.com.edcore.util.HibernateUtil;
import mx.com.edcore.vo.cal.Calendar;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CalendarDAO {
    
    static public Long addCalendar(Calendar calendar){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.getCurrentSession();
        sesion.getTransaction().begin();
        sesion.save(calendar);
        sesion.getTransaction().commit();
        return calendar.getId();
    }
    static public void updateCalendar(Calendar calendar){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.getCurrentSession();
        sesion.getTransaction().begin();
        sesion.update(calendar);
        sesion.getTransaction().commit();
    }
    static public List<Calendar> getCalendars(String sql, Integer displaylength, Integer displaystart){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.getCurrentSession();
        sesion.getTransaction().begin();
        Query query = sesion.createSQLQuery(sql).addEntity(Calendar.class);
        query.setMaxResults(displaylength);
        query.setFirstResult(displaystart);
        List<Calendar> list = query.list();
        sesion.getTransaction().commit();
        return list;
    }
    
}
