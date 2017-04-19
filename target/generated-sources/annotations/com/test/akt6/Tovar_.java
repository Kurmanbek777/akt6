package com.test.akt6;

import com.test.akt6.Form;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T21:28:08")
@StaticMetamodel(Tovar.class)
public class Tovar_ { 

    public static volatile SingularAttribute<Tovar, Integer> invnumber;
    public static volatile CollectionAttribute<Tovar, Form> formCollection;
    public static volatile SingularAttribute<Tovar, Integer> idtovar;
    public static volatile SingularAttribute<Tovar, String> name;
    public static volatile SingularAttribute<Tovar, String> description;

}