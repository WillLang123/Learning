/**
 * @(#)MakeList.java
 *
 * MakeList application
 *
 * @author 
 * @version 1.00 2019/11/19
 */
 import java.util.ArrayList;
public class MakeList {
    
    public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    a.add("standing");
    a.add("candy");
    a.add("island");
    a.add("odd");
    a.add("wand");
    a.add("band");
    a.add("grand");
    a.add("understand");
    a.add("whatever");
    a.add("else");
    for(String d:a){
    	if(d.indexOf("and")!=-1){
    		b.add(d.substring(0,d.indexOf("and")));}}
    		
    System.out.println(a);
    System.out.println(b);
    System.out.println(b.size());
    		
    	
    }
}
