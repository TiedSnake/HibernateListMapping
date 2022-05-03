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
@Table(name = "OS")
public class OS
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "osId", nullable = false)
    private int osId;
    @Column(name = "osname")
    private String osname;

    public OS()
    {
    }

    public OS(String osname)
    {
        this.osname = osname;
    }

    public String getOsname()
    {
        return osname;
    }

    public void setOsname(String osname)
    {
        this.osname = osname;
    }
    
}
