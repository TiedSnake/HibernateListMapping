/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author m-w-n
 */
@Entity
@Table(name ="Color")
public class Color
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colorId", nullable = false)
    private int colorId;
    @Column(name = "colorname")
    private String colorname;

    public Color()
    {
    }

    public Color(String colorname)
    {
        this.colorname = colorname;
    }

    public int getColorId()
    {
        return colorId;
    }

    public void setColorId(int colorId)
    {
        this.colorId = colorId;
    }

    public String getColorname()
    {
        return colorname;
    }

    public void setColorname(String colorname)
    {
        this.colorname = colorname;
    }
    
}