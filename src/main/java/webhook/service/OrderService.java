package webhook.service;

import java.io.IOException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;

import webhook.entity.OrderEntity;
import webhook.model.OrderModel;

@Stateless
@Transactional
public class OrderService {

	@PersistenceContext(unitName = "mysql-pu")
	private EntityManager entityManager;

	private ModelMapper modelMapper = new ModelMapper();

	public OrderModel save(OrderModel orderModel) throws IOException {
		try {
			OrderEntity orderEntity = modelMapper.map(orderModel, OrderEntity.class);
			entityManager.persist(orderEntity);
			return modelMapper.map(orderEntity, OrderModel.class);
		} catch (Exception e) {
			throw new IOException("Erro ao salvar os dados: " + e);
		}
	}

}
