package Student_Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_Model {
	@Id
	private int id;
	private String Name;
	private String Email;
	private String Dob;
	private int Age;
	private long Mob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public long getMob() {
		return Mob;
	}

	public void setMob(long mob) {
		Mob = mob;
	}

	@Override
	public String toString() {
		return "Student_Model [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Dob=" + Dob + ", Age=" + Age
				+ ", Mob=" + Mob + "]";
	}

}
