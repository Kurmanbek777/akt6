package com.test.akt6;

import com.test.akt6.Ofic;
import com.test.akt6.Otdel;
import com.test.akt6.Tovar;
import com.test.akt6.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T21:28:08")
@StaticMetamodel(Form.class)
public class Form_ { 

    public static volatile SingularAttribute<Form, Date> date;
    public static volatile SingularAttribute<Form, Integer> idform;
    public static volatile SingularAttribute<Form, Ofic> oficID;
    public static volatile SingularAttribute<Form, Otdel> otdelID;
    public static volatile SingularAttribute<Form, Tovar> idtovar;
    public static volatile SingularAttribute<Form, User> user2ID;
    public static volatile SingularAttribute<Form, Ofic> ofic2ID;
    public static volatile SingularAttribute<Form, Otdel> otdel2ID;
    public static volatile SingularAttribute<Form, User> userID;

}