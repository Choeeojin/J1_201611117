package headfirst.iterator.dinermerger.after;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;
  public DinerMenuIterator(MenuItem[] items) {
  
  }
  public boolean hasNext() {
    if(position >= items.length) {
      return false;
    }
    else {
      return true;
    }
  }
  public Object next() {
    MenuItem m =items[position];
    position++;
    return m;
  }
}