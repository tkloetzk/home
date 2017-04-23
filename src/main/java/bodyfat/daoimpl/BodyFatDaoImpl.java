package bodyfat.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bodyfat.dao.BodyFatUser;
import bodyfat.dao.CurrentBodyFatUser;

@Repository
@Transactional
public class BodyFatDaoImpl implements BodyFatDao {

	@Autowired
	SessionFactory session;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BodyFatUser> getAllUsers() {
		return session.getCurrentSession().createQuery("from BodyFatUser").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CurrentBodyFatUser> getUserStats(String userID) {
		try {
			 List<CurrentBodyFatUser> list = session.getCurrentSession().createSQLQuery("select * from entries WHERE UserID = " + userID).list();			 
			 return list;
		} catch (Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

}
