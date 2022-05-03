# HibernateListMapping
Assisted Practice Project which demonstrates a servlet that creates 5 POJOs, inserts them into the database, binds them together with a one-to-many relationship, inserts bound tables relationship into a database then retrieve all tables data from Parent Entity and displays it into HTML

1-Regular Index.html file
2-hibernate.cfg.xml for initiating hibernate configurations & properties
3-BProduct.java Annotated Class also a Parent entity Table for tables mentioned below
4-Color.java  Poj class Object contains Product color and color ID
5-Finance Contains Credit card payment
6-OS  Contains the Operating system name for the product
7-ScreenSizes Contains the Screen size of the product
8-ProductDetails which is the servlet that 
  -initiates the connection to the database
  -Begins a Database transaction
  -creates objects of the above tables & initialize them with values
  -Binds the above tables by initializing the parent Table with children's tables 
        BProduct----->Color
                ----->OS
                ----->Finance
                ----->Screensize
  -Saves/inserts the children's tables into the database.
  -Saves/inserts the Parent table in addition to the relationship of its children into the database.
  -Create a select query that returns the Parent table from the database along with the relationship of its children tables.
  -Printing all data inside Parent Table by using toString.
