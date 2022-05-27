package mysql_hibernate_project_entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity// marking any class as entity
//@Table(name = "mystudents") // to change table name in database
public class Student {
	@Id // for marking any key to primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;
	
	@Column(length = 50, name = "FIRST_NAME")
	private String firstName;

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", isAdult=" + isAdult + ", x=" + x + ", birthDate=" + birthDate + ", image=" + Arrays.toString(image)
				+ ", certi=" + certi + "]";
	}

	@Column(name = "LAST_NAME", length = 20)
	private String lastName;

	private String city;

	@Column(name="is_adult")
	private Boolean isAdult;

	
	@Transient
	private double x;

	@Column(name = "birth_DAte")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	@Lob
	private byte[] image;
	
	private Certificate certi;

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getCity() {
		return city;
	}

	public Student() {
		super();
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student(int id, String firstName, String lastName, String city, Boolean isAdult, double x, Date birthDate,
			byte[] image) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.isAdult = isAdult;
		this.x = x;
		this.birthDate = birthDate;
		this.image = image;
	}

}
