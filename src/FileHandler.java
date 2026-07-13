import java.io.*;import java.util.*;
public class FileHandler{
 static final String FILE="data/passwords.txt";
 public static java.util.List<PasswordEntry> load() throws Exception{
  List<PasswordEntry> l=new ArrayList<>();
  File f=new File(FILE); if(!f.exists()) return l;
  Scanner s=new Scanner(f);
  while(s.hasNextLine()){String[] a=s.nextLine().split(",",3); if(a.length==3) l.add(new PasswordEntry(a[0],a[1],a[2]));}
  s.close(); return l;
 }
 public static void save(List<PasswordEntry> l) throws Exception{
  new File("data").mkdirs();
  PrintWriter pw=new PrintWriter(FILE);
  for(PasswordEntry e:l) pw.println(e);
  pw.close();
 }
}
