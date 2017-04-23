package bodyfat.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class BodyFatUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserID")
	private int userID;

	@Column(name = "username")
	private String username;
	
	@Column(name = "is_Male")
	private int is_Male;

	@Column(name = "goalWeight")
	private double goalWeight;

	@Column(name = "goalBodyFat")
	private double goalBodyFat;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getIs_Male() {
		return is_Male;
	}


	public void setIs_Male(int is_Male) {
		this.is_Male = is_Male;
	}


	public double getGoalWeight() {
		return goalWeight;
	}


	public void setGoalWeight(double goalWeight) {
		this.goalWeight = goalWeight;
	}


	public double getGoalBodyFat() {
		return goalBodyFat;
	}


	public void setGoalBodyFat(double goalBodyFat) {
		this.goalBodyFat = goalBodyFat;
	}


	@Override
	public String toString() {
		return "BodyFatUser [UserID = " + userID + ", username=" + username
				+ ", is_Male=" + is_Male + ", goalWeight=" + goalWeight
				+ ", goalBodyFat=" + goalBodyFat + "]";
	}
}
