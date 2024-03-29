package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.onetomany.Pencil;
import com.ustglobal.onetomany.PencilBox;
import com.ustglobal.onetoone.VoterCard;

public class Manytoone {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {		
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
	entityTransaction	 = entityManager.getTransaction();
		
		entityTransaction.begin();
		//entityManager.persist(pr);
	//VoterCard vCard = entityManager.find(VoterCard.class, 10);
//	System.out.println(vCard.getPerson().getId());
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBid(1);
		pencilBox.setBname("camlin");
		Pencil p = new Pencil();
			p.setPid(1);
			p.setColor("black");
		p.setPencilBox(pencilBox);
			Pencil p1 = new Pencil();
			p1.setPid(2);
			p1.setColor("blue");
			p1.setPencilBox(pencilBox);
			
		entityManager.persist(p);
		entityManager.persist(p1);
			
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
