package service;

import model.Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomersService {
    public static List<Customers> getAllCustomers() {
        List<Customers> customersList = new ArrayList<>();
        customersList.add(new Customers("Dung","17/09/1997","Hai Duong","none"));
        customersList.add(new Customers("Huy","08/08/1995","Nghe An","none"));
        customersList.add(new Customers("Hieu","10/11/1996","Nam Dinh","none"));
        customersList.add(new Customers("Quan","16/10/1995","Hoa Binh","none"));
        customersList.add(new Customers("Hiep","NA/NA/1997","Ha Noi","none"));
        customersList.add(new Customers("Nam","24/05/1997","Ha Noi","none"));
        customersList.add(new Customers("Tung","NA/NA/1993","Ha Noi","none"));

        return customersList;
    }
}
