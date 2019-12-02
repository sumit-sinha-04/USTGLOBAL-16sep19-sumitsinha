package TestOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.onetoone.Person;
import com.ustglobal.onetoone.VoterCard;

public class TestOnetoOne {

	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVName("sumit");
		Person p = new Person();
		p.setId(1);
		p.setName("sumit");
	
		p.setVotercard(vc);
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {		
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
	entityTransaction	 = entityManager.getTransaction();
		
		entityTransaction.begin();
		//entityManager.persist(pr);
	VoterCard vCard = entityManager.find(VoterCard.class, 10);
	System.out.println(vCard.getPerson().getId());
			
		System.out.println("Record inserted succesfully");
		entityTransaction.commit();
		}
catch (Exception e) {
	e.printStackTrace();
	entityTransaction.rollback();
}
		entityManager.close();

	
	
	
	

		
	}
}
