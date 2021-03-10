package com.example.myapplication;

public class Ao {
    private String Name;
    private String money;
    private int img;

    public Ao(String name, String money, int img) {
        Name = name;
        this.money = money;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
