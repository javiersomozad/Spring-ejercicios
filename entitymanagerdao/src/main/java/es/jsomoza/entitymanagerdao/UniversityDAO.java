package es.jsomoza.entitymanagerdao;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UniversityDAO  {
  @PersistenceContext  
  private EntityManager entityManager;  

  public University findById(Long universityId) {
    return entityManager.find(University.class, universityId);
  }
  
  public List<University> findAll() {
    String hql = "FROM University as atcl ORDER BY atcl.id";
    return (List<University>) entityManager
    			.createQuery(hql).getResultList();
  }  
  
  public void add (University university) {
    entityManager.persist(university);
    entityManager.flush();
  }
  
  public void update (University university) {
    entityManager.persist(university);
    entityManager.flush();
  }
  
  public void delete (University university) {
    entityManager.remove(university);
    entityManager.flush();
  }
}