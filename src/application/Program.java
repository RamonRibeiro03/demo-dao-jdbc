package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 : seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n === TEST 2 : seller findByDepartment =====");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj: list){
            System.out.println(obj);
        }


        System.out.println("\n === TEST 3 : seller findByAll =====");
        list = sellerDao.findAll();
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n === TEST 4 : seller insert =====");
        Seller newseller = new Seller(null, "Greg", "gerg@gmail.com",new Date(),4000.00,department);
        sellerDao.insert(newseller);
        System.out.println("Inserted! New id = " + newseller.getId());

        System.out.println("\n === TEST 5 : seller update =====");
        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");





    }
}
