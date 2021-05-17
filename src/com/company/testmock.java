package com.company;

public class testmock {

        com.company.mydatabase database = new com.company.mydatabase();

        public static void main(String[] args) {
            testmock t=new testmock();
            t.exec();

        }

        public testmock() {
        }

        public void exec() {
            this.database.connect("http://randomemailaddress", "admin", "admin");
            this.database.disconnect();
            this.database.isConnected();
            this.database.getName(5);
        }
    }

