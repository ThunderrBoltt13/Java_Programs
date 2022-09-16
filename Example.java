import java.io.*;
import java.util.*;
import java.net.*;

import java.awt.*; 
import java.applet.*;

public class ToDoList extends Applet
{

  java.awt.Button      addButton; 
  java.awt.Label       newLabel; 
  java.awt.TextField   addTextField; 
  java.awt.Label       toDoLabel; 
  java.awt.List        toDoList; 
  java.awt.Button      refreshButton;

  public void init() {

  super.init(); 
  setLayout(null); 
  addNotify(); 
  resize(410,336);

  addButton = new java.awt.Button("Add to List"); 
  addButton.reshape(290,222,71,23); 
  addButton.setFont(new Font("Dialog", Font.PLAIN, 12)); 
  add(addButton);

  newLabel = new java.awt.Label("New To-Do Item"); 
  newLabel.reshape(25,202,100,22); 
  newLabel.setFont(new Font("Dialog", Font.BOLD, 12)); 
  add(newLabel);

  addTextField = new java.awt.TextField(); 
  addTextField.reshape(24,225,243,21); 
  add(addTextField);

  toDoLabel = new java.awt.Label("To-Do List"); 
  toDoLabel.reshape(24,24,69,22); 
  toDoLabel.setFont(new Font("Dialog", Font.BOLD, 12)); 
  add(toDoLabel);

  toDoList = new java.awt.List(0,false); 
  add(toDoList); 
  toDoList.reshape(25,48,238,123);

  refreshButton = new java.awt.Button("Refresh"); 
  refreshButton.reshape(287,49,71,23); 
  refreshButton.setFont(new Font("Dialog", Font.PLAIN, 12)); 
  add(refreshButton);

  // "getToDoList()" not created yet: 
  // getToDoList();

  }  // end of init() method

}  // end of ToDoList class

class Example
{
    public static void getToDoList ()
    { 
        try
        {
            URL                url; 
            URLConnection      urlConn; 
            DataInputStream    dis;
            url = new URL("http://webserver.our-intranet.com/ToDoList/ToDoList.txt");
            // Note:  a more portable URL: 
            //url = new URL(getCodeBase().toString() + "/ToDoList/ToDoList.txt");
            urlConn = url.openConnection();
            urlConn.setDoInput(true); 
            urlConn.setUseCaches(false);
            dis = new DataInputStream(urlConn.getInputStream()); 
            String s; 
            toDoList.clear(); 
            while ((s = dis.readLine()) != null)
            {
                toDoList.addItem(s);  
            }
            dis.close();
        }
        catch (MalformedURLException mue) {}
        catch (IOException ioe) {} 
    } 
    public static void main(String[] args)
    {
        getToDoList();

    }
}
