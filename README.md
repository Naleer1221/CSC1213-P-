Date:-2022.03.12
Pactical No:-01
Problem Specification:-My First Java Program
Implementation:-
class MyFirstProgram
{
public static void main(String args[])
{
	System.out.println("hi first program in java");
    System.out.println("hello java developer!!!");
}
}
Output:-
Hy First Program in Java
Hello Java Developers !!!
Conclusion:-I have learned the syntax of main method and printstatement

Date:-2022.03.12
Pactical No:-02
Problem Specification:-How to use Print Statement
Implementation:-
class Ex02
{
public static void main(String args[]) {
  String fac="FAS";
  int n=3;
  double p=10.5;
  int m=5;
  char w1='&';
  boolean isTH= true;
  
  System.out.println(fac);
  System.out.println(n);
  System.out.println(m);
  System.out.println(w1);
  System.out.println(isTH);
  
  System.out.println("my faculty is "+fac);
  System.out.println("The Result1 is "+(n+m));
  System.out.println("The Result2 is "+(p+m));
}
}

Output:-

FAS
3
5
&
true

my faculty is FAS
The Result1 is 8
The Result2 is 15.5

Conclusion:-I have learned how to merge using + operator

Date:-2022.03.12
Pactical No:-03
Problem Specification:-Printing Different datatype values
Implementation:-

class Ex03 { public static void main(String[] args) {
	  boolean isbool =true;
	System.out.println("Boolean :"+isbool);

  byte ByteVal=120;
	System.out.println("Byte:"+ByteVal);
 
  int IntVal=1;
  System.out.println("Integer :"+IntVal);
  
  short ShortVal=14569;
	System.out.println("Short :"+ShortVal);
	
 long LongVal=10000;	
  System.out.println("Long :"+LongVal);
  
  float FloatVal=19.56f;
	System.out.println("Float :"+FloatVal);
 
  double DoubleVal=169.456;
	System.out.println("Double :"+DoubleVal);
	
 char CharVal='a';
	System.out.println("Char :"+CharVal);
	
 char CharVal1='\u0064';
	System.out.println("Char :"+CharVal1);
}
}

Output:-

Boolean :true
Byte:120
Integer :1
Short :14569
Long :10000
Float :19.56
Double :169.456
Char :a
Char :d

Conclusion:-I have learned premetive datatype

Date:-2022.03.12
Pactical No:-04
Problem Specification:-printing String value
Implementation:-

class StuDetails { public static void main(String [] args) {
	System.out.println("Name: Vuhary Muhammathu Naleer");
	System.out.println("Registration Number:2022/ASP/43");	System.out.println("Degree Program: Bsc.ComputerScience");
System.out.println();
	
  String Name="Vuhary Muhammathu Naleer";
	String RegNo="2022/ASP/43";
	String Degree="Bsc.ComputerScience";
	
  System.out.println("Full Name: "+Name);
	System.out.println("Registration Number: "+RegNo);
	System.out.println("Degree Program: "+Degree);

}
} Output:-

Name: Vuhary Muhammathu Naleer
Registration Number:2022/ASP/43
Degree Program: Bsc.ComputerScience

Conclusion:-I have learned about String class

Date:-2022.03.12
Pactical No:-05
Problem Specification:-How to use "\n" escape sequence
Implementation:-

class StudentDetails {
public static void main (String[] args) {
	System.out.println("First Name: naleer \nLast Name: Muhammathu \nAddress : Eravur ,Batticaloa");

}
} Output:-

First Name: Naleer
Last Name: Muhammathu
Address : Eravur,Batticaloa
Conclusion:-I have learned how to use nextline escape sequence

Date:-2022.03.12
Pactical No:-06
Problem Specification:-How to use type casting
Implementation:-

class Exercise { public static void main (String [] args) {
	char c1='g';
	System.out.println("The Character is: "+c1);
 int int1=(int)c1;
 System.out.println("The Character is: "+int1);
 double d1=10.09;
 System.out.println("The Value is: "+d1);
	int int2=(int)d1;	
System.out.println("The Value is: "+int2);
double d2=int1;
System.out.println("The Value is: "+d2);

}
}

Output:-

The Character is: g
The Character is: 103
The Value is: 10.09
The Value is: 10
The Value is: 103.0

Conclusion:-I have learned the syntax of type casting

Date:-2022.03.12
Pactical No:-07
Problem Specification:-Operators
Implementation:-
class Operators {public static void main(String args[])
{
//01.unaryOperator
	int a=12;
 System.out.Println("a--:"+a--+"\n")

//02.logicaloperators
boolean g=true,k=false;
boolean f=(g||k);
System.out.println(c+"\n")

//03.relationalOperators
int p=10,q=20;
boolean f=(p<q);
System.out.println(f+"\n");

//04.AsignmentOperators
long e=100L;
e+=50;
System.out.println(e+"\n");

//05.TernaryOperators
short i=90,j=100,max;
max=(i<j)?i:j;
System.out.println(max);


}

Output:-
a--:12
true
true
150
100


Conclusion:-I have learned how actualy arrathetic operators work
