package entity;

import entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T09:57:28")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> customerName;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> creaditcardInfo;
    public static volatile SingularAttribute<Customer, Users> user;
    public static volatile SingularAttribute<Customer, String> shippingInfo;
    public static volatile SingularAttribute<Customer, String> phoneno;

}