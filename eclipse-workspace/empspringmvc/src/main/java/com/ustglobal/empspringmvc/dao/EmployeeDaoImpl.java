package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public EmployeeBean login(int id, String password) {
		String jpql = "from EmployeeBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql, EmployeeBean.class);

		query.setParameter("id", id);
		query.setParameter("pass", password);

		try {
			EmployeeBean bean =query.getSingleResult();
			return bean;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int register(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			return bean.getId();
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return false;
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager = factory.createEntityManager();

		return manager.find(EmployeeBean.class, id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeebean = manager.find(EmployeeBean.class, bean.getId());
		employeebean.setName(bean.getName());
		employeebean.setGender(bean.getGender());
		employeebean.setPassword(bean.getPassword());
		employeebean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}
}