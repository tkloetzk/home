package bodyfat.daoimpl;

import java.util.List;

import bodyfat.dao.BodyFatUser;
import bodyfat.dao.CurrentBodyFatUser;

public interface BodyFatDao {

    public List<BodyFatUser> getAllUsers();

	public List<CurrentBodyFatUser> getUserStats(String userID);
}
