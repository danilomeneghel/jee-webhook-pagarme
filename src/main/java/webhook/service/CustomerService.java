package webhook.service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;

import webhook.entity.CustomerEntity;
import webhook.model.CustomerModel;

@Stateless
public class CustomerService {

	@PersistenceContext(unitName = "MySqlUT")
	private EntityManager entityManager;

	private ModelMapper modelMapper = new ModelMapper();

	public List<CustomerModel> findAll() throws IOException {
		try {
			List<CustomerEntity> customers = entityManager
					.createQuery("SELECT c FROM CustomerEntity c", CustomerEntity.class).getResultList();
			return customers.stream().map(entity -> modelMapper.map(entity, CustomerModel.class))
					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new IOException("Nenhum dado encontrado: " + e);
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
