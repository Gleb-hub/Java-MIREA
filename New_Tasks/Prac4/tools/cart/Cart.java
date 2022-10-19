package tools.cart;

import tools.user.User;
import tools.good.Good;
import java.util.*;

public class Cart {
    private String userlogin;
    private List<Good> goods;

    public Cart(String userlogin) {
        this.userlogin = userlogin;
        goods = new ArrayList<>();
    }

    public void addGood(Good good) {
        goods.add(good);
    }

    public double buy() {
        double sum = 0;
        for (Good good : goods) {
            sum += good.getGood();
        }
        return sum;
    }

    @Override
    public String toString() {
        String res = userlogin + "\'s cart:{";

        for (int i = 0; i < goods.size(); i++) {
            res += "\n\t(" + goods.get(i).toString() + "),";
        }
        return res.substring(0, res.length() - 1) + "\n}";
    }
}
