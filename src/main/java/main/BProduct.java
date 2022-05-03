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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author m-w-n
 */
@Entity
@Table(name = "BProduct")
public class BProduct
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prid", nullable = false)
    private int prid;
    @Column(name = "prname")
    private String prname;
    @Column(name = "prprice")
    private float prprice;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @OneToMany
    @Column(name = "prcolors")
    private List<Color> prcolors = new ArrayList<>();
    @OneToMany
    @Column(name = "prscreenSizes")
    private Collection<Screensizes> prscreenSizes = new HashSet<>();
    @OneToMany
    @Column(name = "pros")
    private Set<OS> pros = new HashSet();
    @OneToMany
    @Column(name = "prfinance")
    private Map<String, Finance> prfinance = new HashMap<String, Finance>();

    public BProduct()
    {
    }

    public static String MapToString(Map<String, Finance> m)
    {
        StringBuilder s = new StringBuilder("");
        Map<String, Finance> fi = m;

        s.append("[");
        for (String name : fi.keySet())
        {
            s.append("{");
            s.append(name);
            s.append(", ");
            for (Finance f : fi.values())
            {
                s.append(f.getFname());
                s.append(", ");
                s.append(f.getFtype());
            }
            s.append("}");
            s.append(", ");
        }
//        Iterator<Map.Entry<String, Finance>> it = (Iterator<Map.Entry<String, Finance>>) m.entrySet();
//        while (it.hasNext())
//        {
//            s.append("{");
//            s.append(it.next().getKey());
//            s.append(", ");
//            s.append(it.next().getValue().getFname());
//            s.append(", ");
//            s.append(it.next().getValue().getFtype());
//            s.append("}");
//            s.append(", ");
//        }
        s.append("]");
        return s.toString();
    }

    public static String SetToString(Set<OS> os)
    {
        StringBuilder s = new StringBuilder("");
        s.append("[");
        Iterator<OS> it = os.iterator();
        while (it.hasNext())
        {
            s.append(it.next().getOsname());
            s.append(", ");
        }
        s.append("]");
        return s.toString();
    }

    public static String CollectionToString(Collection<Screensizes> c)
    {
        StringBuilder s = new StringBuilder("");
        s.append("[");
        Iterator<Screensizes> it = c.iterator();
        while (it.hasNext())
        {
            s.append(it.next().getScsize());
            s.append(", ");
        }
        s.append("]");
        return s.toString();
    }

    public static String listToString(List<Color> list)
    {
        StringBuilder s = new StringBuilder("");
        s.append("[");
        for (Color c : list)
        {
            s.append(c.getColorname() + ", ");
        }
        s.append("]");
        return s.toString();
    }

    public BProduct(String prname, float prprice)
    {
        this.prname = prname;
        this.prprice = prprice;
        this.dateAdded = new Date();
    }

    public int getPrid()
    {
        return prid;
    }

    public void setPrid(int prid)
    {
        this.prid = prid;
    }

    public String getPrname()
    {
        return prname;
    }

    public void setPrname(String prname)
    {
        this.prname = prname;
    }

    public float getPrprice()
    {
        return prprice;
    }

    public void setPrprice(float prprice)
    {
        this.prprice = prprice;
    }

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded)
    {
        this.dateAdded = dateAdded;
    }

    public List<Color> getPrcolors()
    {
        return prcolors;
    }

    public void setPrcolors(List<Color> prcolors)
    {
        this.prcolors = prcolors;
    }

    public Collection<Screensizes> getPrscreenSizes()
    {
        return prscreenSizes;
    }

    public void setPrscreenSizes(Collection<Screensizes> prscreenSizes)
    {
        this.prscreenSizes = prscreenSizes;
    }

    public Set<OS> getPros()
    {
        return pros;
    }

    public void setPros(Set<OS> pros)
    {
        this.pros = pros;
    }

    public Map<String, Finance> getPrfinance()
    {
        return prfinance;
    }

    public void setPrfinance(Map<String, Finance> prfinance)
    {
        this.prfinance = prfinance;
    }

    @Override
    public String toString()
    {
        return "BProduct{" + "prid=" + prid + ", prname=" + prname + ", prprice=" + prprice + ", dateAdded=" + dateAdded + ", prcolors=" + listToString(prcolors) + ", prscreenSizes=" + CollectionToString(prscreenSizes) + ", pros=" + SetToString(pros) + ", prfinance=" + MapToString(prfinance) + '}';
    }
}
