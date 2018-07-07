package com.example.mj5waghmare.birthday;

/**
 * Created by Mj5Waghmare on 24-Feb-18.
 */

public class Buddy {
    private int id;
    private String name;
    private String dob;
    private byte[] image;

    public Buddy(int id, String name, String dob, byte[] image) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
