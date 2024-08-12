
class OldDon {

public OldDon()	{
}
public void title(){
	System.out.println("\t    Old Macdonald's Farm");
}
public void blank(){
	System.out.println("");
}
public void Line1(){
	System.out.println("Old MacDonald had a farm, E-I-E-I-O");
	}
public void Line2(String a){
	System.out.println("And on his farm he had a " + a + ", E-I-E-I-O");
}
public void Line345(String b){
	System.out.printf("With a %s here and a %s there%nHere a %s there a %s%nEverywhere a %s-%s%n",b,b,b,b,b,b);

}
public void verse(String c,String d){
	Line1();
	Line2(c);
	Line345(d);
	Line1();
}
public void SingSong(){
title();
blank();
verse("cow","moo");
blank();
verse("pig","snort");
blank();
verse("horse","neigh");

}
 }

