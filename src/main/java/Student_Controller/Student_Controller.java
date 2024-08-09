package Student_Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Student_Model.Student_Model;

public class Student_Controller {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public void saveStudentData(Student_Model s) {
		et.begin();
		em.persist(s);
		et.commit();
	}

	public void getAllDatas() {
		Query q = em.createQuery("select s from Student_Model s");

		List<Student_Model> al = q.getResultList();

		if (!al.isEmpty()) {
			for (Student_Model s : al) {
				System.out.println(s);
			}

		} else
			System.out.println("Record Not Found........");

	}

	public void updateById(int id, String name) {

		Student_Model s = em.find(Student_Model.class, id);
		if (s != null) {
			s.setName(name);
			et.begin();
			em.merge(s);
			et.commit();

			System.out.println("your data has succesfully been updated....");
		} else
			System.out.println("Record Not found.....");

	}

	public void DeleteDatas(int id) {
		Student_Model s = em.find(Student_Model.class, id);
		if (s != null) {

			et.begin();
			em.remove(s);
			et.commit();

			System.out.println("your data has succesfully been deleted....");
		} else
			System.out.println("Record Not found.....");

	}

	public void DeleteAllDatas() {

		Query q = em.createQuery("delete from Student_Model s");
		et.begin();
		int n = q.executeUpdate();
		et.commit();
		System.out.println("the numbers of row are affected:-" + " " + n);
		System.out.println("all datas has beed deleted");

	}

}
