package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;

import java.util.Random;
@Controller
public class CartController {
    private final Cart cart;

    @Autowired
    public CartController(Cart cart){
        this.cart = cart;

    }



    @GetMapping("/cart")
    public String printAll(Model model) {
        model.addAttribute("calaLista", cart.getCartItemList());
        return "cart";
    }

    @PostMapping("/addedtocart")
    public String addToCart(Model model,@RequestParam("quantity") String quantity, @RequestParam ("name") String name, @RequestParam("price") String price, @RequestParam ("id")  String id ) {
        Random rand = new Random();
        int i=0;
        CartItem cartItem = new CartItem(Integer.parseInt(quantity),
                new Product(name, Double.parseDouble(price)), id);
        cart.addToCart(cartItem);
        model.addAttribute("rzeczy", cartItem);

        return "addedProduct";
    }
    @GetMapping("/addtocart")
    public String showForm(){
        return "addingForm";
    }
    @GetMapping("/removal")
    public String removal(@RequestParam("id") String id){
        cart.removeFromCart(id);
        return "redirect:cart";
    }
    @GetMapping("/addone")
    public String addPiece(@RequestParam ("id") String id){
        cart.addQuantity(id);
        return "redirect:cart";
    }
}