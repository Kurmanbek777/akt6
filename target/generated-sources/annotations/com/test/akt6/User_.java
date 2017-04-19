package com.test.akt6;

import com.test.akt6.Form;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T21:28:08")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lName;
    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, String> fName;
    public static volatile CollectionAttribute<User, Form> formCollection;
    public static volatile CollectionAttribute<User, Form> formCollection1;
    public static volatile SingularAttribute<User, Integer> otdelID;

}