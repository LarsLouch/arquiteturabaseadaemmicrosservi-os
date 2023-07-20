package one.digitalinnovation.experts.shoppingcart.repository;

import one.digitalinnovation.experts.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
