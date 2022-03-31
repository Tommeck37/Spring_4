package pl.coderslab.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
@Primary
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    private List<CartItem> cartItemList = new ArrayList<>();

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    public void addToCart(CartItem cartItem) {
        cartItemList.add(cartItem);
    }

    public void removeFromCart(String id) {
        for (int i = 0; i < cartItemList.size(); i++) {
            if(id.equals(cartItemList.get(i).getId())){
                cartItemList.remove(cartItemList.get(i));

            }
        }
    }
    public void addQuantity(String id){
        for(int i =0; i<cartItemList.size(); i++){
            if(id.equals(cartItemList.get(i).getId())){
                cartItemList.get(i).setQuantity(cartItemList.get(i).getQuantity()+1);
            }
        }
    }
}