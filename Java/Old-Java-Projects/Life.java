/**
 * @(#)Life.java
 *
 * Life application
 *
 * @author 
 * @version 1.00 2020/1/7
 */
 //gl fucko
 import java.io.*;
 import java.util.Scanner;
public class Life {
	public Life(int[][]dish){
		Scanner inFile;
		try{
			inFile=new Scanner(new File("life100.txt"));
			int loop,howmany,r,c;
			
		howmany=inFile.nextInt();
		for(loop=1;loop<=howmany;loop++){
			r=inFile.nextInt();
			c=inFile.nextInt();
			dish[r][c]=1;
		}
		}catch(IOException e){
			System.out.println("Could not create Life! Error: "+e.getMessage());
		}}
public void screenDump(int[][]temp){
	int row,col;
	
	System.out.println("       12345678901234567890");
	System.out.println();
	for(row=1;row<=20;row++){
		System.out.printf("%7d", row);
	for(col=1;col<=20;col++){
		if(temp[row][col]>0){
			System.out.print("*");
		}else{
			System.out.print(" ");
		}
			}System.out.println();
		}
	}
public int countLiving(int[][] temp){
	int count=0;
	for(int r=1;r<=20;r++)
	for(int c=1;c<=20;c++)
	if(temp[r][c]==1)
		count++;
		return count;
}
public int countRow(int[][] temp,int row){
	int count=0;
	for(int c=1;c<=20;c++)
	if(temp[row][c]==1)
		count++;
		return count;
}
public int countCol(int[][] temp,int col){
	int count=0;
	for(int r=1;r<=20;r++)
	if(temp[r][col]==1)
		count++;
		return count;
}
public void nextGen(int[][] mainDish){
	int[][]dataDish=new int[mainDish.length][mainDish[0].length];
	for(int r=1;r<=20;r++)
	for(int c=1;c<=20;c++){
	int count=0;
	if(mainDish[r][c]==0){
		if(mainDish[r-1][c-1]==1)
			count++;
		if(mainDish[r-1][c]==1)
			count++;
		if(mainDish[r-1][c+1]==1)
			count++;
		if(mainDish[r][c-1]==1)
			count++;
		if(mainDish[r][c+1]==1)
			count++;
		if(mainDish[r+1][c-1]==1)
			count++;
		if(mainDish[r+1][c]==1)
			count++;
		if(mainDish[r+1][c+1]==1)
			count++;
		if (count==3)
	dataDish[r][c]=1;}
	
	
if(mainDish[r][c]==1){
		if(mainDish[r-1][c-1]==1)
			count++;
		if(mainDish[r-1][c]==1)
			count++;
		if(mainDish[r-1][c+1]==1)
			count++;
		if(mainDish[r][c-1]==1)
			count++;
		if(mainDish[r][c+1]==1)
			count++;
		if(mainDish[r+1][c-1]==1)
			count++;
		if(mainDish[r+1][c]==1)
			count++;
		if(mainDish[r+1][c+1]==1)
			count++;
		if (count==0||count==1)
			dataDish[r][c]=0;
		if (count==2||count==3)
			dataDish[r][c]=1;
		if (count>=4)
			dataDish[r][c]=0;}
		}
	for(int r=1;r<=20;r++)
		for(int c=1;c<=20;c++)
		mainDish[r][c]=dataDish[r][c];
}
	

	
    
    public static void main(String[] args) {
    	
    int[][] x=new int[100][100];
    Life xx=new Life(x);
    xx.screenDump(x);
    xx.nextGen(x);
    xx.screenDump(x);
    xx.nextGen(x);
    xx.screenDump(x);
    xx.nextGen(x);
    xx.screenDump(x);
    xx.nextGen(x);
    xx.screenDump(x);
    xx.nextGen(x);
    xx.screenDump(x);
    }
}
