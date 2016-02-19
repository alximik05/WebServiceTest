package business;

import model.Product;

import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by USER on 01.02.2016.
 */
public class Service {
    List<String> booklist = new ArrayList<>();
    List<String> movieslist = new ArrayList<>();
    List<String> musiclist = new ArrayList<>();

    public Service() {
        booklist.add("Book1");
        booklist.add("Book2");
        booklist.add("Book3");

        movieslist.add("movie1");
        movieslist.add("movie2");
        movieslist.add("movie3");

        musiclist.add("music1");
        musiclist.add("music2");
        musiclist.add("music3");
    }

    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    public List<String> getProductList(String category) {
        switch (category) {
            case "books":
                return booklist;
            case "music":
                return musiclist;
            case "movie":
                return movieslist;
        }
        return null;
    }

    public List<Product> getProductList2(String category) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book1", "1234", 999.99));
        products.add(new Product("Book2", "4321", 21.99));
        return products;
    }

    public List<String> getCatalog() {
        List<String> catalog = new ArrayList<>();
        catalog.add("Books");
        catalog.add("Movies");
        catalog.add("Music");
        return catalog;
    }

    public boolean addProduct(String category, String product) {
        switch (category) {
            case "books":
                return booklist.add(product);
            case "music":
                return musiclist.add(product);
            case "movie":
                return movieslist.add(product);
        }
        return false;
    }

}
