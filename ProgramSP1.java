//Engility
//Sjmobley,kfichma,marcelle
//Report 3, code
//CSC 540




/*** ASSUMPTIONS:
  * - Code demonstrated in the following order : ADD,UPDATE,FIND(SELECT),DELETE
  * - All data valid
  * - User does not enter invalid information
  * - List to be completed
  * 
  * 
  * 
  ***/

/***************
// Commit data.
      System.out.println("Commiting data here....");
      connection.commit();
   
      //list all the available records.
      String sql = "SELECT ibla FROM blub";
      ResultSet option0 = statement.executeQuery(sql);
      System.out.println("List result set for reference....");
      //??printRs(option0);
      
      
      //Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //Open a connection
      System.out.println("Connecting to database...");
      connection = DriverManager.getConnection(DB_URL,user,password);
      
      
      //Clean-up environment and close connections
      option0.close();
      statement.close();
      connection.close();
      
      
      
      //commit and rollback
      
      // If there is no error.
      connection.commit();
      catch(SQLException se){
     // If there is any error.
      connection.rollback();
      }
    ********************************/


import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*; 

public class ProgramSP1{
 
 static String usr="sjmobley", pass= "000926007";
 static String url = "jdbc:oracle:thin:@ora.csc.ncsu.edu:1523:orcl"; // String url= "jdbc:mySubprotocol:myDataSource"; ?
 static Statement stmt;
 static Connection conn;
 public static void main(String args[]){

 JOptionPane.showMessageDialog(null,"JDBC Program showing transactions and operations for Books-A-Thousand DBMS");
  int choice0 = -1;
  int choice1 = -1;
  int choice2 = -1;
  int choice3 = -1;
  int choice4 = -1;
  int choice5 = -1;
  int choice6 = -1;
  
  //choice 0 - Main Menu
  do{
   choice0 = getChoice0();
   if (choice0 != 0){
    mainMenu(choice0);
   }
  }
  while ( choice0 !=  0);
   System.exit(0);
 
 
 
 //choice 1 - Customer Menu
  do{
   choice1 = getChoice1();
   if (choice1 != 0){
    customerMenu(choice1);
   }
  }
  while ( choice1 !=  0);
   System.exit(0);

   
   //choice 2 - Employee Menu
  do{
   choice2 = getChoice2();
   if (choice2 != 0){
    employeeMenu(choice2);
   }
  }
  while ( choice2 !=  0);
   System.exit(0);
   
   //choice 3 - Inventory Menu
  do{
   choice3 = getChoice3();
   if (choice3 != 0){
    inventoryMenu(choice3);
   }
  }
  while ( choice3 !=  0);
   System.exit(0);
   
   //Choice 4 - Contracts Menu
   
  do{
   choice4 = getChoice4();
   if (choice4 != 0){
    contractMenu(choice4);
   }
  }
  while ( choice4 !=  0);
   System.exit(0);
   
   
   // Choice 5 - Vendor Menu
   
  do{
   choice5 = getChoice5();
   if (choice5 != 0){
    vendorMenu(choice5);
   }
  }
  while ( choice5 !=  0);
   System.exit(0);
   
   // Choice 6 - Reports Menu
   
  do{
   choice6 = getChoice6();
   if (choice6 != 0){
    reportMenu(choice6);
   }
  }
  while ( choice6 !=  0);
   System.exit(0);
 }
   
   
 
 
 //Main menu
 public static int getChoice0()
 {
  String choice0;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice0 = JOptionPane.showInputDialog(null,
   "1. Work with Customers\n"+
   "2. Work with Employees\n"+
   "3. Work with Inventory\n"+
   "4. work with Contracts\n"+
   "5. Work with Vendors\n"+
   "6. Work with Reports\n"+                                    
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice0);
  return ch;
 }
 

//Customer Menu
 public static int getChoice1()
 {
  String choice1;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice1 = JOptionPane.showInputDialog(null,
   "1. Add Customer\n"+
   "2. Update Customer\n"+
   "3. Remove Customer\n"+
   "4. Find Customer\n"+                            
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice1);
  return ch;
 }
 
  //Employee menu
 public static int getChoice2()
 {
  String choice2;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice2 = JOptionPane.showInputDialog(null,
   "1. Add Employee\n"+
   "2. Update Employee\n"+
   "3. Remove Employee\n"+
   "4. Find Employee\n"+                                
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice2);
  return ch;
 }
   
   
   // Inventory Menu
  public static int getChoice3()
 {
  String choice3;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice3 = JOptionPane.showInputDialog(null,
   "1. Add Inventory\n"+
   "2. Update Inventory\n"+
   "3. Remove Inventory\n"+
   "4. Find Inventory\n"+                            
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice3);
  return ch;
 }
 
 // Contract Menu
 public static int getChoice4()
 {
  String choice4;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice4 = JOptionPane.showInputDialog(null,
   "1. Add Contract\n"+
   "2. Update Contract\n"+
   "3. Remove Contract\n"+
   "4. Find Contract\n"+                                
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice4);
  return ch;
 }
 
 //Vendor Menu
 public static int getChoice5()
 {
  String choice5;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice5 = JOptionPane.showInputDialog(null,
   "1. Add Vendor\n"+
   "2. Update Vendor\n"+
   "3. Remove Vendor\n"+
   "4. Find Vendor\n"+                           
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice5);
  return ch;
 }
 
 // Report Menu
 public static int getChoice6()
 {
  String choice6;
  int ch;
  //int chosen;
  //Scanner ch = new Scanner(System.in); 
  choice6 = JOptionPane.showInputDialog(null,
   "1. Create Customer Report\n"+
   "2. Create Employee Report\n"+
   "3. Create Inventory Report\n"+
   "4. Create Sales Report\n"+
   "5. Create Billing Report\n"+
   "6. Work with Reports\n"+                                    
   "0. Exit\n\n"+
   "Enter your choice");
  ch = Integer.parseInt(choice6);
  return ch;
 }
  
  
  /* System.out.println();
   System.out.println();
   System.out.println(" *** Books-A-Thousand Info System ***");
   System.out.println();
    
   System.out.println("Choose your option from 1-4 below"); 
   System.out.println("1. Work with Customers"); 
   System.out.println("2. Work with Employees"); 
   System.out.println("3. Work with Inventory");
   System.out.println("4. Work with Vendors");
   System.out.println("5. Work with Contracts");
   System.out.println("6. Work with Reports");    
   System.out.println("7. Quit"); 
   System.out.print("Enter your choice [1-7]: "); 
   chosen = ch.nextInt();
   return chosen;*/


 
 
    /*Public void mainMenu(){
    System.out.println();
    System.out.println();
    System.out.println(" *** Books-A-Thousand Info System ***");
    System.out.println();
    
    System.out.println("Choose your option from 1-4 below"); 
    System.out.println("1. Work with Customers"); 
    System.out.println("2. Work with Employees"); 
    System.out.println("3. Work with Inventory");
    System.out.println("4. Work with Vendors");
    System.out.println("5. Quit"); 
    System.out.print("Enter your choice [1-5]: "); 
    choiceStr0 = in.readLine();*/ 

 public static void mainMenu(int choice0){
  if(choice0==1){
   customerMenu(int choice1);
  }
  if(choice0==2){
   employeeMenu(int choice2);
  }
  if(choice0==3){
   inventoryMenu(int choice3);
  }
  if(choice0==4){
   contractMenu(int choice4);
  }
  if(choice0==5){
   vendorMenu(int choice5);
  }
  if(choice0==6){
   reportMenu(int choice6);
  }
 }
 
 public static void customerMenu(int choice1){
  if(choice1==1){
   addCustomer();
  }
  if(choice1==2){
   updateCustomer();
  }
  if(choice1==3){
   removeCustomer();
  }
  if(choice1==4){
   findCustomer();
  }
  /*if(choice==5){
   menuVendor();
  }
  if(choice==6){
   menuReports();
  }*/
 }
 
 public static void employeeMenu(int choice2){
  if(choice2==1){
   addEmployee();
  }
  if(choice2==2){
   updateEmployee();
  }
  if(choice2==3){
  removeEmployee();
  }
  if(choice2==4){
   findEmployee();
  }
  /*if(choice==5){
   menuVendor();
  }
  if(choice==6){
   menuReports();
  }*/
 }
 
 public static void inventoryMenu(int choice3){
  if(choice3==1){
   addInventory();
  }
  if(choice3==2){
   updateInventory();
  }
  if(choice3==3){
   removeInventory();
  }
  if(choice3==4){
   findInventory();
  }
  /*if(choice3==5){
   menuVendor();
  }
  if(choice==6){
   menuReports();
  }*/
 }
 
 public static void contractMenu(int choice4){
  if(choice4==1){
   addContract();
  }
  if(choice4==2){
   updateContract();
  }
  if(choice4==3){
   removeContract();
  }
  if(choice4==4){
   findContract();
  }
  /*if(choice4==5){
   menuVendor();
  }
  if(choice4==6){
   menuReports();
  }*/
 }
 
 public static void vendorMenu(int choice5){
  if(choice5==1){
   addVendor();
  }
  if(choice5==2){
   updateVendor();
  }
  if(choice5==3){
   removeVendor();
  }
  if(choice5==4){
   findVendor();
  }
  /*if(choice5==5){
   menuVendor();
  }
  if(choice5==6){
   menuReports();
  }*/
 }
 
 public static void reportMenu(int choice6){
  if(choice6==1){
   menuCustomer();
  }
  if(choice6==2){
   menuEmployee();
  }
  if(choice6==3){
   menuInventory();
  }
  if(choice6==4){
   menuContracts();
  }
  if(choice6==5){
   menuVendor();
  }
  if(choice6==6){
   menuReports();
  }
 }
 
 public static Connection getConnection()
 {
    
  try {
   Class.forName("oracle.jdbc.driver.OracleDriver");
 //Class.forName("myDriver.ClassName"); ?

  } catch(java.lang.ClassNotFoundException e) {
   System.err.print("ClassNotFoundException: ");
   System.err.println(e.getMessage());
  }

  try {
   conn = DriverManager.getConnection(url,
     usr, pass);

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
  
  return conn;
 }
 
 /*CREATE TABLE Employees (
      Employee_ID INTEGER,
      Name VARCHAR(30)
  );*/
 
 public static void addEmployee()
 {
   Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void addCustomer()
 {
   Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void addVendor()
 {
   Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void addContract()
 {
   Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void addInventory()
 {
   Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void updateCustomer()
 {Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 public static void updateEmlpoyee()
 {;
 }
 
 public static void updateInventory()
 {;
 }
 
 public static void udpateVendor()
 {;
 }
 
 public static void updateContract()
 {;
 }
 
 public static void removeCustomer()
 {;
 }
 
 public static void removeEmployee()
 {;
 }
 
 public static void removeInventory()
 {;
 }
 
 public static void removeVendor()
 {;
 }
 
 public static void removeContract()
 {;
 }
 
 public static void findEmployee()
 {
   Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
 public static void findCustomer()
 {
   Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
 public static void findContract()
 {
   Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
 public static void findInventory()
 {
   Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
 public static void findVendor()
 {
   Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
   
   
 public static void createEmployees()
 {
  Connection conn = getConnection();
  
  String createString;
  createString = "create table Employees (" +
       "Employee_ID INTEGER, " +
       "Name VARCHAR(30))";
  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(createString);
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Employees Table Created");
 }

 /*CREATE TABLE Orders (
      Prod_ID INTEGER,
      ProductName VARCHAR(20),
      Employee_ID INTEGER
  );*/
 
 public static void createOrders()
 {
  Connection conn = getConnection();
  
  String createString;
  createString = "create table Orders (" +
      "Prod_ID INTEGER, " +
      "ProductName VARCHAR(20), "+
      "Employee_ID INTEGER )";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(createString);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Orders Table Created");
 }
 
 /*Employee_ID  Name 
   6323   Hemanth 
   5768   Bob 
   1234   Shawn 
   5678   Michaels */
 public static void insertEmployees()
 {
  Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Employees values(6323, 'Hemanth')";
  insertString2 = "insert into Employees values(5768, 'Bob')";
  insertString3 = "insert into Employees values(1234, 'Shawn')";
  insertString4 = "insert into Employees values(5678, 'Michaels')";
  

  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
      stmt.executeUpdate(insertString4);

   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Employees Table");
 }
 
 /* Prod_ID  ProductName  Employee_ID 
    543  Belt    6323 
    432  Bottle    1234 
    876  Ring   5678 
 */
 public static void insertOrders()
 {
  Connection conn = getConnection();
  
  String insertString1, insertString2, insertString3, insertString4;
  insertString1 = "insert into Orders values(543, 'Belt', 6323)";
  insertString2 = "insert into Orders values(432, 'Bottle', 1234)";
  insertString3 = "insert into Orders values(876, 'Ring', 5678)";
  
 
  try {
   stmt = conn.createStatement();
      stmt.executeUpdate(insertString1);
      stmt.executeUpdate(insertString2);
      stmt.executeUpdate(insertString3);
 
   stmt.close();
   conn.close();
 
  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null,"Data Inserted into Orders Table");
 }
 
 public static void retrieveEmployees(){
  Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Employees";
     result ="Employee_ID\t\tName\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
       int id = rs.getInt("Employee_ID");
       String name = rs.getString("Name");
       result+=id+"\t\t"+ name+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }
 
 public static void retrieveOrders(){
  Connection conn = getConnection();
  String result = null;
  String selectString;
  selectString = "select * from Orders";
  result ="Prod_ID\t\tProductName\t\tEmployee_ID\n";
  try {
   stmt = conn.createStatement();
   ResultSet rs = stmt.executeQuery(selectString);
   while (rs.next()) {
    int pr_id = rs.getInt("Prod_ID");
    String prodName = rs.getString("ProductName");
       int id = rs.getInt("Employee_ID");
       result +=pr_id+"\t\t"+ prodName+"\t\t"+id+"\n";
   }
   stmt.close();
   conn.close();

  } catch(SQLException ex) {
   System.err.println("SQLException: " + ex.getMessage());
  }
 JOptionPane.showMessageDialog(null, result);
 }


}//End of class

