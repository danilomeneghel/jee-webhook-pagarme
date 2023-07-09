package pagarme.dao;

import java.io.IOException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;

import pagarme.entity.OrderEntity;
import pagarme.model.OrderModel;

@Stateless
@Transactional
public class OrderDao {

	@PersistenceContext(unitName = "Oracle19DS")
	private EntityManager entityManager;

	private ModelMapper modelMapper = new ModelMapper();

	public OrderModel findOne(String order_id) throws IOException {
		try {
			OrderEntity order = entityManager.find(OrderEntity.class, order_id);
			return modelMapper.map(order, OrderModel.class);
		} catch (Exception e) {
			throw new IOException("Erro ao encontrar registro: " + e);
		}
	}

	public OrderModel save(OrderModel orderModel) throws IOException {
		try {
			OrderEntity orderEntity = modelMapper.map(orderModel, OrderEntity.class);
			entityManager.persist(orderEntity);
			return modelMapper.map(orderEntity, OrderModel.class);
		} catch (Exception e) {
			throw new IOException("Erro ao salvar registro: " + e);
		}
	}

}
