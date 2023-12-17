package com.example.First_Projict_SpringBoot.utils;

public final class Constants {


    private Constants(){}

    public final static String USERS_TABLE_NAME = "users";
    public final static String POLLS_TABLE_NAME = "polls";

    public final static String USERS_POLL_TABLE_NAME = "users_poll";



    public static String insertInto(String tableName, String[] columnNames, String[] values){
        String columns = arrayToValues(columnNames);
        String newValues = arrayToValues(values);
        return "INSERT INTO" + tableName + " " + columns + " VALUES " + newValues;
    }

    private static String arrayToValues(String[] arr){
        String result = "(";
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1){
                result += arr[i] + ",";
            }else{
                result += arr[i];
            }
        }
        result += ")";
        return result;
    }








}
