package pagarme.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.modelmapper.ModelMapper;

import pagarme.entity.CustomerEntity;
import pagarme.model.CustomerModel;

@Stateless
public class CustomerDao {

	@PersistenceContext(unitName = "Oracle19DS")
	private EntityManager entityManager;

	private ModelMapper modelMapper = new ModelMapper();

	public CustomerModel findById(String id) throws IOException {
		try {
			CustomerEntity customer = entityManager.find(CustomerEntity.class, id);
			return modelMapper.map(customer, CustomerModel.class);
		} catch (Exception e) {
			throw new IOException("Erro ao encontrar registro: " + e);
		}
	}

	public List<CustomerModel> findAll() throws IOException {
        try {
        	CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    		CriteriaQuery<CustomerEntity> criteriaQuery = criteriaBuilder.createQuery(CustomerEntity.class);
    		Root<CustomerEntity> root = criteriaQuery.from(CustomerEntity.class);
    		criteriaQuery.select(root);
    		
    		List<CustomerEntity> customers = entityManager.createQuery(criteriaQuery).getResultList();
    		
            List<CustomerModel> customerModels = new ArrayList<>();
            for (CustomerEntity customer : customers) {
                customerModels.add(modelMapper.map(customer, CustomerModel.class));
            }
            return customerModels;
        } catch (Exception e) {
            throw new IOException("Error finding records: " + e);
        }
    }

	public CustomerModel save(CustomerModel customerModel) throws IOException {
		try {
			CustomerEntity customerEntity = modelMapper.map(customerModel, CustomerEntity.class);
			entityManager.persist(customerEntity);
			return modelMapper.map(customerEntity, CustomerModel.class);
		} catch (Exception e) {
			throw new IOException("Erro ao salvar os dados: " + e);
		}
	}

}
