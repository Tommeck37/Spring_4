package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;

import java.util.List;
import java.util.Random;

@RestController
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/cart")
    public List<CartItem> printAll() {
        return cart.getCartItemList();
    }

    @GetMapping("/addtocart")
    public CartItem addToCart() {
        Random rand = new Random();
        CartItem cartItem = new CartItem(1,
                new Product("prod" + rand.nextInt(10), rand.nextDouble()));
        cart.addToCart(cartItem);

        return cartItem;
    }
}
