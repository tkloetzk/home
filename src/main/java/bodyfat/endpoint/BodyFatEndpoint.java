package bodyfat.endpoint;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bodyfat.dao.BodyFatUser;
import bodyfat.dao.CurrentBodyFatUser;
import bodyfat.service.BodyFatService;

@Controller
@RequestMapping("/bodyfat")
public class BodyFatEndpoint {
	@Autowired
	private BodyFatService bodyFatService;

	@RequestMapping(value="/getAllUsers", method = RequestMethod.GET)
	public ResponseEntity<List<BodyFatUser>> getAllUsers() {
		List<BodyFatUser> getAllUsersResponse = null;
		
		try {
			getAllUsersResponse = bodyFatService.getAllUsers();
			if (getAllUsersResponse == null) {
				return new ResponseEntity<List<BodyFatUser>>(HttpStatus.NO_CONTENT);
			}
   			return new ResponseEntity<List<BodyFatUser>>(getAllUsersResponse, HttpStatus.OK);
			
		}catch (Exception e){
			e.printStackTrace();
			return new ResponseEntity<List<BodyFatUser>>(HttpStatus.BAD_REQUEST);
		}
		
	}
	@RequestMapping(value="/getUserStats", params = {"User_ID"}, method = RequestMethod.GET)
	public ResponseEntity<List<CurrentBodyFatUser>> getUserStats(@RequestParam(value = "User_ID") String userID) {
		System.out.println("getUserStats service");
		List<CurrentBodyFatUser> getUserStatsResponse = null;
		try {
			getUserStatsResponse = bodyFatService.getUserStats(userID);
			if (getUserStatsResponse == null) {
				return new ResponseEntity<List<CurrentBodyFatUser>>(HttpStatus.NO_CONTENT);
			}
   			return new ResponseEntity<List<CurrentBodyFatUser>>(getUserStatsResponse, HttpStatus.OK);
		} catch (Exception e){
			e.getMessage();
			return new ResponseEntity<List<CurrentBodyFatUser>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/updateUser", method = RequestMethod.POST)
	public ResponseEntity<List<BodyFatUser>> updateUser(@RequestBody BodyFatUser user) {
		System.out.println("updateUser service");
		return null;
		
	}
	
}
