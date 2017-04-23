package bodyfat.service;

import java.util.List;

import bodyfat.dao.BodyFatUser;
import bodyfat.dao.CurrentBodyFatUser;

public interface BodyFatService {
	public List<BodyFatUser> getAllUsers();

	public List<CurrentBodyFatUser> getUserStats(String userID);
}
