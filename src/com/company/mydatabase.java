package com.company;

public class mydatabase implements com.company.DBInterface {

    public mydatabase(){

    }
    @Override
    public boolean connect(String address, String userename, String password) {
        System.out.println("we just called the connect method");
        return false;
    }

    @Override
    public void disconnect() {
        System.out.println("we just called the disconnect method");

    }

    @Override
    public boolean isConnected() {
        System.out.println("the method to determine if it is connected is called");

        return false;
    }

    @Override
    public String getName(int id) {
        System.out.println("THE getname method is called");

        return "a name is returned";
    }
}
