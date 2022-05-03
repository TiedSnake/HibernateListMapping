# HibernateListMapping
Assisted Practice Project which demonstrates a servlet that creates 5 POJOs, inserts them into the database, binds them together with a one-to-many relationship, inserts bound tables relationship into a database then retrieve all tables data from Parent Entity and displays it into HTML</br>

1-Regular Index.html file</br>
2-hibernate.cfg.xml for initiating hibernate configurations & properties</br>
3-BProduct.java Annotated Class also a Parent entity Table for tables mentioned below</br>
4-Color.java  Poj class Object contains Product color and color ID</br>
5-Finance Contains Credit card payment</br>
6-OS  Contains the Operating system name for the product</br>
7-ScreenSizes Contains the Screen size of the product</br>
8-ProductDetails which is the servlet that </br>
  -initiates the connection to the database</br>
  -Begins a Database transaction</br>
  -creates objects of the above tables & initialize them with values</br>
  -Binds the above tables by initializing the parent Table with children's tables </br>
        BProduct----->Color</br>
                ----->OS</br>
                ----->Finance</br>
                ----->Screensize</br>
  -Saves/inserts the children's tables into the database.</br>
  -Saves/inserts the Parent table in addition to the relationship of its children into the database.</br>
  -Create a select query that returns the Parent table from the database along with the relationship of its children tables.</br>
  -Printing all data inside Parent Table by using toString.</br>
