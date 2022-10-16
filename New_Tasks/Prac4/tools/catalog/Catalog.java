package tools.catalog;

import tools.good.Good;
import java.util.*;
import tools.categories.Categories;

public class Catalog {
    private String name;
    private List<Good> goods;
    private Categories cat;

    public Catalog(String name, Categories cat) {
        this.cat = cat;
        this.name = name;
        this.goods = new ArrayList<>();
    }

    public void addGood(String name, double cost) {
        goods.add(new Good(name, cost));
    }

    @Override
    public String toString() {
        String res = name + "(" + cat + ")" + ":{";
        for (Good good : goods) {
            res += "\n\t(" + good.toString() + "),";
        }
        return res.substring(0, res.length() - 1) + "\n}";
    }
}
