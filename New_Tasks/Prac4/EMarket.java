import tools.categories.Categories;
import tools.user.User;
import tools.good.Good;
import tools.catalog.Catalog;
import java.util.*;

public class EMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите логин: ");
        String login = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password = sc.nextLine();

        User user = new User(login, password);
        System.out.println("Your login and password = " + user.toString());

        List<Catalog> catalogsAll = new ArrayList<>();

        for (Categories category : Categories.values()) {
            Catalog curr = new Catalog("catalog", category);
            catalogsAll.add(curr);

            for (int i = 0; i < 10; i++) {
                curr.addGood("good" + i, i);
            }
        }

        System.out.println(catalogsAll);
    }
}
