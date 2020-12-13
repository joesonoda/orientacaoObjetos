class Exercicios6{
public static void main(String[]args){

int atual=1;
int anterior=1;
int proximo=atual+anterior;
System.out.println(anterior);
System.out.println(atual);

while (atual <100);
System.out.println(proximo);

anterior=atual;
atual=proximo;
proximo=anterior+atual;
}}

