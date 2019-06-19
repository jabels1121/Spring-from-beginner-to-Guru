package com.jaybe.didemo.examplebeans;

public class FakeDatasource {

    private String userName;
    private String password;
    private String dbUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "FakeDatasource{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                '}';
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
