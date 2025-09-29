package com.codewithmosh.store.repositories;

import com.codewithmosh.store.entities.Cart;
import com.codewithmosh.store.entities.CartItem;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface CartRepository extends JpaRepository<Cart, UUID> {

    @EntityGraph(attributePaths = "items.product")
    @Query("SELECT c FROM Cart c WHERE c.id = :cartId")
    Optional<Cart> getCartWithItems(@Param("cartId") UUID cartId);


    @Query("SELECT ci FROM CartItem ci WHERE ci.cart.id = :cartId and ci.product.id = :productId")
    Optional<CartItem> findCartItemByCartIdAndProductId(@Param("cartId") UUID cartId, @Param("productId") Long productId);
}