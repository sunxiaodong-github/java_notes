package com.java.base.learn.thrift.demo;

import org.apache.thrift.TException;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/6 6:29 PM
 */
public class PersonServiceImpl implements PersonService.Iface {

    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println("Got Client Param: " + username);

        Person person = new Person();
        person.setUsername(username);
        person.setAge(23);
        person.setMerried(false);

        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println("Got Client Param: " + person);
    }
}
