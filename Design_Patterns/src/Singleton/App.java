package Singleton;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        long start;
        long end;

        DBManager dbManager =  DBManager.getDbManager();
        System.out.println(dbManager);

        start = System.currentTimeMillis();
        Connection connection = dbManager.getConnection();
        end = System.currentTimeMillis();

        System.out.println(end-start);

        start = System.currentTimeMillis();
        DBManager dbManager1 =  DBManager.getDbManager();
        end = System.currentTimeMillis();

        System.out.println(end-start);

        System.out.println(dbManager1);

    }
}
