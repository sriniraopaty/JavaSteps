public class phasOMatric{

pubic static void main(String[] args){
String[] wordone = {"w1","w2","w3"};
String[] wordtwo = {"w4","w5","w6"};
String[] wordthree = {"w7","w8","w9"};

int wordoneln = wordone.length;
int wordtwoln = wordtwo.length;
int wordthree = wordthree.length;

int ran1 = int ( Math.random() * wordoneln);
int ran2 = int ( Math.random() * wordtwoln);
int ran3 = int ( Math.random() * wordthreeln);

String phrase = wordone[ran1] + ' ' + wordtwo[ran2] + ' ' + wordthree[ran3] ;

System.out.println("phrase value " + phrase);
}}
