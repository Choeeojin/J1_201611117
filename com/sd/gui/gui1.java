package com.sd.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
  
public class CalcAreaListener implements ActionListener {
  void actionPerformed(ActionEvent e) {
    System.out.println("Hello");
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    if(cmd.equals("���")) {
      System.out.println("����ư");
      b.setText("����߽��ϴ�.");
    }
  }
}



