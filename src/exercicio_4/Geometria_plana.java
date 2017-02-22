package exercicio_4;

import java.util.Scanner;

public class Geometria_plana {

	public static Scanner scanner;

	public static void main(String args[]) {
		// TODO Auto-generated method stub

	
	
     // algoritmo que verifica se quatro pontos informados pelo usuário
     //formam um retângulo. tendo em vista que para forma um retângulo são
     //necessários apenas serem informados duas coordenadas
     //((Xa,Ya),(Xb,Yb)) formando um rentângulo assim
     //((Xa,Ya),(Xb,Yb),(Xa,Yb),(Xb,Yb))
     
	int Xa, Xb,Ya,Yb;
	int Xc, Xd,Yc,Yd;
	scanner = new Scanner(System.in);
	
	
	System.out.println("Vamos formar o primeiro retângulo.");
	System.out.println("Por favor informe as coordenadas Xa, Ya, Xb e Yb, uma por vez");
	System.out.println("pressionando [ENTER] a cada valor digitado, lembrando que para");
	System.out.println("formar um rentângulo as coordenadas não podem ser iguais.\n");
	
	
	System.out.println("Informe a coordenada Xa:");
	
	Xa = scanner.nextInt();
	System.out.println("Informe a coordenada Xa:");
	Xb = scanner.nextInt();
	
	while( Xa == Xb){
		System.out.println("As coordenadas das abcissas são iguais, por favor informe");
		System.out.println("valores diferentes \n");
		System.out.println("por favor informe a coordenadas Xa");
		Xa = scanner.nextInt();
		System.out.println("por favor informe a coordenadas Xb");
		Xb = scanner.nextInt();
	
	}
    
	System.out.println("Informe a coordenada Ya:");
	Ya = scanner.nextInt();
	System.out.println("Informe a coordenada Ya:");
	Yb = scanner.nextInt();
	
	while( Ya == Yb){
		System.out.println("As coordenadas das abcissas são iguais, por favor informe");
		System.out.println("valores diferentes \n");
		System.out.println("por favor informe a coordenadas Xa");
		Xa = scanner.nextInt();
		System.out.println("por favor informe a coordenadas Xb");
		Xb = scanner.nextInt();
	
	}
	
	System.out.println("Você criou o retângulo de coordenadas: ((" + Xa + ", " + Ya + "), (" + Xb +", "+ Yb +"), ("+ Xa +", "+ Yb +"), ("+ Xb +", "+ Yb +"))\n");
	
	/*
     * Algoritmo que verifica se quatro pontos informados pelo usuário
     * formam um retângulo. tendo em vista que para forma um retângulo são
     * necessários apenas serem informados duas coordenadas
     * ((Xc,Yc),(Xd,Yd)) formando um rentângulo assim
     * ((Xc,Yc),(Xd,Yd),(Xc,Yd),(Xd,Yc))
     */
	System.out.println("Agora iremos formar um segundo retângulo.");
    System.out.println("Por favor informe as coordenadas Xc, Yc, Xd e Yd uma por vez");
    System.out.println("pressionando [ENTER] a cada valor digitado, lembrando que para");
    System.out.println("formar um rentângulo as coordenadas não podem ser iguais.\n");

    System.out.println("Por favor informe a coordenadas Xc");
    Xc = scanner.nextInt();
    System.out.println("Por favor informe a coordenadas Xd");
    Xd = scanner.nextInt();
    while (Xc == Xd) {
        System.out.println("As coordenadas das abcissas são iguais, por favor informe");
        System.out.println("valores diferentes\n");
        System.out.println("Por favor informe a coordenadas Xc");
        Xc = scanner.nextInt();
        System.out.println("Por favor informe a coordenadas Xd");
        Xd = scanner.nextInt();
    }

    System.out.println("Por favor informe a coordenadas Yc");
    Yc = scanner.nextInt();
    System.out.println("Por favor informe a coordenadas Yd");
    Yd = scanner.nextInt();
    while (Yc == Yd) {
        System.out.println("As coordenadas das ordenadas são iguais, por favor informe");
        System.out.println("valores diferentes\n");
        System.out.println("Por favor informe a coordenadas Ya");
        Yc = scanner.nextInt();
        System.out.println("Por favor informe a coordenadas Yb");
        Yd = scanner.nextInt();
    }
    System.out.println("Você criou o retângulo de coordenadas:((" + Xc
            + ", " + Yc + "), (" + Xd + ", " + Yd + "), (" + Xc + ", " + Yd
            + "),(" + Xd + ", " + Yc + "))\n");

    /*Verificando se os vértices 2º e 4º do primeiro retângulo 
    *são iguais aos vértices do segundo retângulo*/

    if (Xb==Xc) {
       if (Yb==Yc)
          System.out.println("Os retângulos possuem o 2º vértice do primeiro ("+Xb+", "+Yb+") e o 1º vértice do segundo " +
                  "("+Xc+","+Yc+") idênticos");
       else if (Yb==Yd)
          System.out.println("Os retângulos possuem o 2º vértice do primeiro ("+Xb+", "+Yb+") e o 3º vértice do segundo ("+
                  Xc+", "+Yd+") idênticos");
    } 
    else if (Xb==Xd) {
            if (Yb==Yd)
               System.out.println("Os retângulos possuem o 2º vértice do primeiro ("+Xb+", "+Yb+") e o 2º vértice do segundo("+
                       Xd+", "+Yd+") idênticos");
            else if (Yb==Yc)
               System.out.println("Os retângulos possuem o 2º vértice do primeiro ("+Xb+", "+Yb+") e o 4º vértice do segundo("+
                       Xd+", "+Yc+") idênticos");
    } 

    if (Xb==Xc) {
       if (Ya==Yc)
          System.out.println("Os retângulos possuem o 4º vértice do primeiro ("+Xb+", "+Ya+") e o 1º vértice do segundo ("+
                  Xc+", "+Yc+") idênticos");
       else if (Ya==Yd)
          System.out.println("Os retângulos possuem o 4º vértice do primeiro ("+Xb+", "+Ya+") e o 3º vértice do segundo ("+
                  Xc+",    "+Yd+") idênticos");
    } 

    else if (Xb==Xd) {
            if (Ya==Yd)
               System.out.println("Os retângulos possuem o 4º vértice do primeiro ("+Xb+", "+Ya+") e o 2º vértice do segundo("+
                       Xd+", "+Yd+") idênticos");
              else if (Ya==Yc)
               System.out.println("Os retângulos possuem o 4º vértice do primeiro ("+Xb+", "+Ya+") e o 4º vértice do segundo("+
                       Xd+", "+Yc+") idênticos");
    } 
    /*Verificando se os vértices 1º e 3º do primeiro retângulo 
    *são iguais aos vértices do segundo retângulo*/    
    if (Xa==Xc) {
           if (Ya==Yc)
              System.out.println("Os retângulos possuem o 1º vértice do primeiro ("+Xa+", "+Ya+") e o 1º vértice do segundo ("+
                      Xc+", "+Yc+") idênticos");
           else if (Ya==Yd)
              System.out.println("Os retângulos possuem o 1º vértice do primeiro ("+Xa+", "+Ya+") e o 3º vértice do segundo ("+
                      Xc+", "+Yd+") idênticos");
        } 

    else if (Xa==Xd) {
                if (Ya==Yd)
                   System.out.println("Os retângulos possuem o 1º vértice do primeiro ("+Xa+", "+Ya+") e o 2º vértice do segundo ("+
                           Xd+", "+Yd+") idênticos");
                 else if (Ya==Yc)
                   System.out.println("Os retângulos possuem o 1º vértice do primeiro ("+Xa+", "+Ya+") e o 4º vértice do segundo ("+
                           Xd+", "+Yc+") idênticos");
        } 

        if (Xa==Xc) {
           if (Yb==Yc)
              System.out.println("Os retângulos possuem o 3º vértice do primeiro ("+Xa+", "+Yb+") e o 1º vértice do segundo ("+
                      Xc+", "+Yc+") idênticos");
           else if (Yb==Yd)
              System.out.println("Os retângulos possuem o 3º vértice do primeiro ("+Xa+", "+Ya+") e o 3º vértice do segundo ("+
                      Xc+", "+Yd+") idênticos");
        } 
        else if (Xa==Xd) {
                if (Yb==Yd)
                   System.out.println("Os retângulos possuem o 3º vértice do primeiro ("+Xa+", "+Yb+") e o 2º vértice do segundo ("+
                           Xd+", "+Yd+") idênticos");
                else if (Yb==Yc)
                        System.out.println("Os retângulos possuem o 3º vértice do primeiro ("+Xa+", "+Yb+") e o 4º vértice do segundo ("+
                           Xd+", "+Yc+") idênticos");
        }     

        /*Verificando se os retângulos se sobrepõem*/

        if (Xa==Xc && Xb==Xd) {   
           if (Ya==Yc && Yb==Yd) 
              System.out.println("Os Retângulos se sobrepõem.");
        }
        else if (Xa==Xd && Xb==Xc) {   
                if (Ya==Yd && Yb==Yc) 
                   System.out.println("Os Retângulos se sobrepõem.");
        }
        else {
            System.out.println("Os retângulos não se sobrepõem");
        }

}
	
}
