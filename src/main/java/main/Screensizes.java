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
@Table(name = "Screensizes")
public class Screensizes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screenId", nullable = false)
    private int screenId;
    @Column(name = "scsize")
    private String scsize;

    public Screensizes()
    {
    }

    public Screensizes(String scsize)
    {
        this.scsize = scsize;
    }

    public String getScsize()
    {
        return scsize;
    }

    public void setScsize(String scsize)
    {
        this.scsize = scsize;
    }
    
}
