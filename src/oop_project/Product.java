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
public class Product {

    private int id;
    private String name, des;
    private String img = "default.png";
    private int count, price;

    public Product() {
    }

    
    
    public Product(int id, String name, String img, int count, int price, String des) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.count = count;
        this.price = price;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
    public ImageIcon getIcon(){
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

}
