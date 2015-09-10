package com.dat.testslidingtabs2.adapter_n_shits;

/**
 * Created by DAT on 7/6/2015.
 */
public class Dummy {
    String name, address;
    int imageid;

    public Dummy() {
    }

    public Dummy(String name, String address, int imageid) {
        this.name = name;
        this.address = address;
        this.imageid = imageid;
    }

    public Dummy(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
