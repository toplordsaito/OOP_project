/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author waruwat
 */
public class Customer {

    private int id, age;
    private String fname, lname, address, tel, img, des;

    public Customer() {
        this(0, 0, "", "", "", "", "", "");
    }

    public Customer(int id, int age, String fname, String lname, String address, String tel, String img, String des) {
        this.id = id;
        this.age = age;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.tel = tel;
        this.img = img;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public ImageIcon getIcon() {
        try {
            String ImagePath = new File(".").getCanonicalPath() + "\\img\\product\\" + getImg();
            ImageIcon MyImage = new ImageIcon(ImagePath);
            Image imgz = MyImage.getImage();
            Image newImg = imgz.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);
            return image;
        } catch (IOException ex) {
            Logger.getLogger(EachProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void ShowIMG(JLabel j) {
        try {
            String ImagePath = new File(".").getCanonicalPath() + "\\img\\product\\" + getImg();
            ImageIcon MyImage = new ImageIcon(ImagePath);
            Image img = MyImage.getImage();
            Image newImg = img.getScaledInstance(j.getWidth(), j.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);
            j.setIcon(image);
        } catch (IOException ex) {
            Logger.getLogger(EachProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
