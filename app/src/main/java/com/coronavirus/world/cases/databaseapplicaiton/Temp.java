package com.coronavirus.world.cases.databaseapplicaiton;

public class Temp
{


    public static DBHandler dbHandler;

    public static DBHandler getDbHandler() {
        return dbHandler;
    }

    public static void setDbHandler(DBHandler dbHandler) {
        Temp.dbHandler = dbHandler;
    }
}
