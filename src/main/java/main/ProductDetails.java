/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author m-w-n
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Configuration config = new Configuration().configure(new File(req.getRealPath("hibernate.cfg.xml")));
        config.addAnnotatedClass(main.BProduct.class);
        config.addAnnotatedClass(main.Color.class);
        config.addAnnotatedClass(main.Finance.class);
        config.addAnnotatedClass(main.OS.class);
        config.addAnnotatedClass(main.Screensizes.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
        SessionFactory factory = config.buildSessionFactory(builder.build());
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        BProduct pr1 = new BProduct("HP Laptop ABC", (float) 21900.00);
        BProduct pr2 = new BProduct("Acer Laptop ABC", (float) 23300.00);
        BProduct pr3 = new BProduct("Lenovo Laptop ABC", (float) 33322.00);
        Color c1 = new Color("Red");
        Color c2 = new Color("Silver");
        Color c3 = new Color("Gray");
        Color c4 = new Color("White");
        Color c5 = new Color("Maroon");
        Finance f1 = new Finance("CREDITCARD EMI on Citibank Card", "1");
        Finance f2 = new Finance("BANK 40% FINANCE FROM SBI", "2");
        Finance f3 = new Finance("BANK 60% finance from ICICI", "3");
        Finance f4 = new Finance("BANK 20% finance from ICICI", "4");
        OS os1 = new OS("Windows 10");
        OS os2 = new OS("FreeDOS");
        OS os3 = new OS("RedHat Linux");
        Screensizes  s1 = new Screensizes("12 in");
        Screensizes  s2 = new Screensizes("14.5 in");
        Screensizes  s3 = new Screensizes("14.9 in");
        Screensizes  s4 = new Screensizes("15.5 in");
        
        //Binding Product With Colors
        pr1.getPrcolors().add(c2);
        pr1.getPrcolors().add(c4);
        pr2.getPrcolors().add(c1);
        pr2.getPrcolors().add(c3);
        pr3.getPrcolors().add(c5);
        pr3.getPrcolors().add(c1);
        
        //Binding Product with Payment Type "Finance"
        pr1.getPrfinance().put(f1.getFtype(), f1);
        pr1.getPrfinance().put(f2.getFtype(), f2);
        pr2.getPrfinance().put(f2.getFtype(), f2);
        pr2.getPrfinance().put(f4.getFtype(), f4);
        pr3.getPrfinance().put(f3.getFtype(), f3);
        pr3.getPrfinance().put(f4.getFtype(), f4);
        
        //Binding Product with Operating System
        pr1.getPros().add(os1);
        pr1.getPros().add(os2);
        pr1.getPros().add(os3);
        pr2.getPros().add(os1);
        pr3.getPros().add(os1);
        pr3.getPros().add(os2);
        pr3.getPros().add(os3);
        
        //Binding Product with Screen Size
        pr1.getPrscreenSizes().add(s4);
        pr1.getPrscreenSizes().add(s3);
        pr2.getPrscreenSizes().add(s1);
        pr3.getPrscreenSizes().add(s3);
        pr3.getPrscreenSizes().add(s4);
        pr3.getPrscreenSizes().add(s2);
        
        
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        session.save(c5);
        session.save(f1);
        session.save(f2);
        session.save(f3);
        session.save(f4);
        session.save(os1);
        session.save(os2);
        session.save(os3);
        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(pr1);
        session.save(pr2);
        session.save(pr3);
//        t.commit();
        List<BProduct> list = session.createQuery("from BProduct").list();
        List<Color> colors;
        Map finances;
        Set<OS> os;
        Collection<Screensizes> sizes;
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<b>Product Listing</b><br>");
        for (BProduct p : list)
        {
            out.println(p.toString());
//            colors = p.getPrcolors();
//            out.println("Colors: ");
//            for (Color c : colors)
//            {
//                out.println(c.getName() + "&nbsp;");
//            }
//            sizes = p.getPrscreenSizes();
//            out.println(", Screen Sizes: ");
//            for (Screensizes s : sizes)
//            {
//                out.println(s.getSize() + "&nbsp;");
//            }
//
//            os = p.getPros();
//            out.println(", OS: ");
//            for (OS o : os)
//            {
//                out.println(o.getName() + "&nbsp;");
//            }
//            finances = p.getPrfinance();
//            out.println(", Finance Options: ");
//            if (finances.get("CREDITCARD") != null)
//            {
//                Finance f = (Finance) finances.get("CREDITCARD");
//                out.println(f.getName() + "&nbsp;");
//            }
            out.println("<hr>");
        }
        session.close();
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        doGet(req, resp);
    }

}
