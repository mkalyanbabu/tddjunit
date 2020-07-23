package main;
public class Remove2chars
{
 public String remove(String s)
 { 
  String res="";
  int i=0;
  char c0=s.charAt(0),c1=charAt(1);
  if(s.length()>0)
  {
   if(c0=='A' && c1=='A')
   res+=substring(3,s.length()+1);
   else if(c0=='A'&&c1!='A')
   res+=substring(1,s.length()+1);
   else if(c0!='A'&&c1=='A')
   res+=c0+substring(2,s.length()+1);
   else
   res+=s;
  }
  return res;
 }
}