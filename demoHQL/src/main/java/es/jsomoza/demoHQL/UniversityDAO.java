package es.jsomoza.demoHQL;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class UniversityDAO {
	 @PersistenceContext
	 private EntityManager entityManager;
	 
	 public University findById(Long universityId) {
		  String hql = "select u from University u where u.id = :id";
		  return (University) entityManager
		    .createQuery(hql)
		    .setParameter("id", universityId)
		    .getSingleResult();
		 }

		 public List<University> findByName(String name) {
		  String hql = "select u from University u where u.name like :name";
		  return (List<University>) entityManager
		    .createQuery(hql)
		    .setParameter("name", "%"+ name +"%")
		    .getResultList();

		 }
		 
	 
	 public List<University> findAll() {
		  String hql = "FROM University as u ORDER BY u.id";
		  return (List<University>) entityManager.createQuery(hql).getResultList();
		 }
	 public List<University> search(String name, Integer miyear) {
		  String hql = "FROM University as u WHERE u.name = ?1 and u.miyear = ?2";
		  return (List<University>) entityManager
		    .createQuery(hql)
		    .setParameter(1, name)
		    .setParameter(2, miyear)
		    .getResultList();
		 }
	 
	 public void add(long id, String name, Integer miyear) {
		  String hql = "INSERT INTO University as u(u.id, u.name, u.miyear) VALUES (?1, ?2, ?3)";
		  entityManager
		    .createQuery(hql)
		    .setParameter(1, id)
		    .setParameter(2, name)
		    .setParameter(3, miyear)
		    .executeUpdate();
		 return;
	 }

	 public void update(University university) {
		  entityManager.persist(university);
		  entityManager.flush();
		 }

		 public void delete(University university) {
		  entityManager.remove(university);
		 }
}
