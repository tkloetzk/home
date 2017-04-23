package bodyfat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bodyfat.dao.BodyFatUser;
import bodyfat.dao.CurrentBodyFatUser;
import bodyfat.daoimpl.BodyFatDao;

@Service
public class BodyFatServiceImpl implements BodyFatService {

	@Autowired
	BodyFatDao bodyFatDao;
	
	@Override
	public List<BodyFatUser> getAllUsers() {
		return bodyFatDao.getAllUsers();
	}

	@Override
	public List<CurrentBodyFatUser> getUserStats(String userID) {
		return bodyFatDao.getUserStats(userID);
	}

}
