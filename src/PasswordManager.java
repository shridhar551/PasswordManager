import java.util.*;
public class PasswordManager{
 List<PasswordEntry> list=new ArrayList<>();
 Scanner sc=new Scanner(System.in);
 public PasswordManager(){try{list=FileHandler.load();}catch(Exception e){}}
 void start(){
 while(true){
 System.out.println("1 Add 2 View 3 Delete 4 Exit");
 switch(sc.nextLine()){
 case "1":add();break; case "2":view();break; case "3":del();break; case "4":try{FileHandler.save(list);}catch(Exception e){} return;
 }}}
 void add(){System.out.print("Website:");String w=sc.nextLine();System.out.print("Username:");String u=sc.nextLine();System.out.print("Password:");String p=sc.nextLine();list.add(new PasswordEntry(w,u,p));}
 void view(){for(PasswordEntry e:list)System.out.println(e.website+" "+e.username+" "+e.password);}
 void del(){System.out.print("Website:");String w=sc.nextLine();list.removeIf(e->e.website.equals(w));}
}
