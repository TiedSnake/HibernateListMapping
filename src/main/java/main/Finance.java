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
@Table(name = "Finance")
public class Finance
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "financeId", nullable = false)
    private int financeId;
    @Column(name = "fname")
    private String fname;
    @Column(name = "ftype")
    private String ftype;

    public Finance()
    {
    }

    public Finance(String fname, String ftype)
    {
        this.fname = fname;
        this.ftype = ftype;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getFtype()
    {
        return ftype;
    }

    public void setFtype(String ftype)
    {
        this.ftype = ftype;
    }
    
}