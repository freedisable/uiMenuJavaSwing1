/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author hiros
 */
public class ModelMenu {
    private String icon;
    private String name;
    private Type type;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
    public static enum Type{
        MENU, TITLE, EMPTY
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/icon/"+ icon + ".png"));
    }

    public ModelMenu(String icon, String name, Type type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public ModelMenu() {
    }

    @Override
    public String toString() {
        return "ModelMenu{" + "icon=" + icon + ", name=" + name + ", type=" + type + '}';
    }
    
}
