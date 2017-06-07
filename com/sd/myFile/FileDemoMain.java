package com.sd.myFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.File;

public class FileDemoMain {
  public static void main(String[] args) {
    int i;
    char c;
    String str;
    File readme = null;
    FileInputStream isReadme = null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme = null;
    
    try {
      String cwd = new File(".").getCanonicalPath();
      readme = new File(cwd,"파일명 적기");
      isReadme = new FileInputStream(readme);
      isrReadme = new InputStreamReader(isReadme,"UTF8");
      brReadme = new BufferedReader(isrReadme);
      while((c = brReadme.readLine()) !=null) {
        c = (char)i;
        System.out.println(str);
      } 
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      if(isReadme !=null)
        isReadme.close();
    }
  } 
}  