package com.company;

public interface DBInterface {

    boolean connect(String address, String userename, String password);

    void disconnect();

    boolean isConnected();

    String getName(int id);
}