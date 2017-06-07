package headfirst.iterator.dinermerger.before;

public class DinerMenu {
  MenuItem[] menuitem;
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  public DinerMenu() {
    menuitems = new MenuItem[MAX_ITEMS];
    addItem("BLT","Bacon, Lettuce, Tomato",true,2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
  }
  
  public void addItem(String n,String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuitems[numberOfItems] = menuItem;
    //numberOfItem++;
    numberOfItems = numberOfItem + 1;
  }
  public MenuItem[] getMenuItems() {
    return menuitems;
  }
}