package bodyfat.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "entries")
public class CurrentBodyFatUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserID")
	private int UserId;
	
	@Column(name = "bodyFatPercentageEntry")
	private double bodyFatPercentageEntry;
	
	@Column(name = "bodyWeightEntry")
	private double bodyWeightEntry;
	
	@Column(name = "muscle")
	private double muscle;
	
	@Column(name = "fat")
	private double fat;
	
	@Column(name = "date")
	private Date date;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		this.UserId = userId;
	}

	public double getBodyFatPercentageEntry() {
		return bodyFatPercentageEntry;
	}

	public void setBodyFatPercentageEntry(double bodyFatPercentageEntry) {
		this.bodyFatPercentageEntry = bodyFatPercentageEntry;
	}

	public double getBodyWeightEntry() {
		return bodyWeightEntry;
	}

	public void setBodyWeightEntry(double bodyWeightEntry) {
		this.bodyWeightEntry = bodyWeightEntry;
	}

	public double getMuscle() {
		return muscle;
	}

	public void setMuscle(double muscle) {
		this.muscle = muscle;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
