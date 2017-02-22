package exercicio_4;

import java.util.Scanner;

public class Geometria_plana {

	public static Scanner scanner;

	public static void main(String args[]) {
		// TODO Auto-generated method stub

	
	
     // algoritmo que verifica se quatro pontos informados pelo usu�rio
     //formam um ret�ngulo. tendo em vista que para forma um ret�ngulo s�o
     //necess�rios apenas serem informados duas coordenadas
     //((Xa,Ya),(Xb,Yb)) formando um rent�ngulo assim
     //((Xa,Ya),(Xb,Yb),(Xa,Yb),(Xb,Yb))
     
	int Xa, Xb,Ya,Yb;
	int Xc, Xd,Yc,Yd;
	scanner = new Scanner(System.in);
	
	
	System.out.println("Vamos formar o primeiro ret�ngulo.");
	System.out.println("Por favor informe as coordenadas Xa, Ya, Xb e Yb, uma por vez");
	System.out.println("pressionando [ENTER] a cada valor digitado, lembrando que para");
	System.out.println("formar um rent�ngulo as coordenadas n�o podem ser iguais.\n");
	
	
	System.out.println("Informe a coordenada Xa:");
	
	Xa = scanner.nextInt();
	System.out.println("Informe a coordenada Xa:");
	Xb = scanner.nextInt();
	
	while( Xa == Xb){
		System.out.println("As coordenadas das abcissas s�o iguais, por favor informe");
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
		System.out.println("As coordenadas das abcissas s�o iguais, por favor informe");
		System.out.println("valores diferentes \n");
		System.out.println("por favor informe a coordenadas Xa");
		Xa = scanner.nextInt();
		System.out.println("por favor informe a coordenadas Xb");
		Xb = scanner.nextInt();
	
	}
	
	System.out.println("Voc� criou o ret�ngulo de coordenadas: ((" + Xa + ", " + Ya + "), (" + Xb +", "+ Yb +"), ("+ Xa +", "+ Yb +"), ("+ Xb +", "+ Yb +"))\n");
	
	/*
     * Algoritmo que verifica se quatro pontos informados pelo usu�rio
     * formam um ret�ngulo. tendo em vista que para forma um ret�ngulo s�o
     * necess�rios apenas serem informados duas coordenadas
     * ((Xc,Yc),(Xd,Yd)) formando um rent�ngulo assim
     * ((Xc,Yc),(Xd,Yd),(Xc,Yd),(Xd,Yc))
     */
	System.out.println("Agora iremos formar um segundo ret�ngulo.");
    System.out.println("Por favor informe as coordenadas Xc, Yc, Xd e Yd uma por vez");
    System.out.println("pressionando [ENTER] a cada valor digitado, lembrando que para");
    System.out.println("formar um rent�ngulo as coordenadas n�o podem ser iguais.\n");

    System.out.println("Por favor informe a coordenadas Xc");
    Xc = scanner.nextInt();
    System.out.println("Por favor informe a coordenadas Xd");
    Xd = scanner.nextInt();
    while (Xc == Xd) {
        System.out.println("As coordenadas das abcissas s�o iguais, por favor informe");
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
        System.out.println("As coordenadas das ordenadas s�o iguais, por favor informe");
        System.out.println("valores diferentes\n");
        System.out.println("Por favor informe a coordenadas Ya");
        Yc = scanner.nextInt();
        System.out.println("Por favor informe a coordenadas Yb");
        Yd = scanner.nextInt();
    }
    System.out.println("Voc� criou o ret�ngulo de coordenadas:((" + Xc
            + ", " + Yc + "), (" + Xd + ", " + Yd + "), (" + Xc + ", " + Yd
            + "),(" + Xd + ", " + Yc + "))\n");

    /*Verificando se os v�rtices 2� e 4� do primeiro ret�ngulo 
    *s�o iguais aos v�rtices do segundo ret�ngulo*/

    if (Xb==Xc) {
       if (Yb==Yc)
          System.out.println("Os ret�ngulos possuem o 2� v�rtice do primeiro ("+Xb+", "+Yb+") e o 1� v�rtice do segundo " +
                  "("+Xc+","+Yc+") id�nticos");
       else if (Yb==Yd)
          System.out.println("Os ret�ngulos possuem o 2� v�rtice do primeiro ("+Xb+", "+Yb+") e o 3� v�rtice do segundo ("+
                  Xc+", "+Yd+") id�nticos");
    } 
    else if (Xb==Xd) {
            if (Yb==Yd)
               System.out.println("Os ret�ngulos possuem o 2� v�rtice do primeiro ("+Xb+", "+Yb+") e o 2� v�rtice do segundo("+
                       Xd+", "+Yd+") id�nticos");
            else if (Yb==Yc)
               System.out.println("Os ret�ngulos possuem o 2� v�rtice do primeiro ("+Xb+", "+Yb+") e o 4� v�rtice do segundo("+
                       Xd+", "+Yc+") id�nticos");
    } 

    if (Xb==Xc) {
       if (Ya==Yc)
          System.out.println("Os ret�ngulos possuem o 4� v�rtice do primeiro ("+Xb+", "+Ya+") e o 1� v�rtice do segundo ("+
                  Xc+", "+Yc+") id�nticos");
       else if (Ya==Yd)
          System.out.println("Os ret�ngulos possuem o 4� v�rtice do primeiro ("+Xb+", "+Ya+") e o 3� v�rtice do segundo ("+
                  Xc+",    "+Yd+") id�nticos");
    } 

    else if (Xb==Xd) {
            if (Ya==Yd)
               System.out.println("Os ret�ngulos possuem o 4� v�rtice do primeiro ("+Xb+", "+Ya+") e o 2� v�rtice do segundo("+
                       Xd+", "+Yd+") id�nticos");
              else if (Ya==Yc)
               System.out.println("Os ret�ngulos possuem o 4� v�rtice do primeiro ("+Xb+", "+Ya+") e o 4� v�rtice do segundo("+
                       Xd+", "+Yc+") id�nticos");
    } 
    /*Verificando se os v�rtices 1� e 3� do primeiro ret�ngulo 
    *s�o iguais aos v�rtices do segundo ret�ngulo*/    
    if (Xa==Xc) {
           if (Ya==Yc)
              System.out.println("Os ret�ngulos possuem o 1� v�rtice do primeiro ("+Xa+", "+Ya+") e o 1� v�rtice do segundo ("+
                      Xc+", "+Yc+") id�nticos");
           else if (Ya==Yd)
              System.out.println("Os ret�ngulos possuem o 1� v�rtice do primeiro ("+Xa+", "+Ya+") e o 3� v�rtice do segundo ("+
                      Xc+", "+Yd+") id�nticos");
        } 

    else if (Xa==Xd) {
                if (Ya==Yd)
                   System.out.println("Os ret�ngulos possuem o 1� v�rtice do primeiro ("+Xa+", "+Ya+") e o 2� v�rtice do segundo ("+
                           Xd+", "+Yd+") id�nticos");
                 else if (Ya==Yc)
                   System.out.println("Os ret�ngulos possuem o 1� v�rtice do primeiro ("+Xa+", "+Ya+") e o 4� v�rtice do segundo ("+
                           Xd+", "+Yc+") id�nticos");
        } 

        if (Xa==Xc) {
           if (Yb==Yc)
              System.out.println("Os ret�ngulos possuem o 3� v�rtice do primeiro ("+Xa+", "+Yb+") e o 1� v�rtice do segundo ("+
                      Xc+", "+Yc+") id�nticos");
           else if (Yb==Yd)
              System.out.println("Os ret�ngulos possuem o 3� v�rtice do primeiro ("+Xa+", "+Ya+") e o 3� v�rtice do segundo ("+
                      Xc+", "+Yd+") id�nticos");
        } 
        else if (Xa==Xd) {
                if (Yb==Yd)
                   System.out.println("Os ret�ngulos possuem o 3� v�rtice do primeiro ("+Xa+", "+Yb+") e o 2� v�rtice do segundo ("+
                           Xd+", "+Yd+") id�nticos");
                else if (Yb==Yc)
                        System.out.println("Os ret�ngulos possuem o 3� v�rtice do primeiro ("+Xa+", "+Yb+") e o 4� v�rtice do segundo ("+
                           Xd+", "+Yc+") id�nticos");
        }     

        /*Verificando se os ret�ngulos se sobrep�em*/

        if (Xa==Xc && Xb==Xd) {   
           if (Ya==Yc && Yb==Yd) 
              System.out.println("Os Ret�ngulos se sobrep�em.");
        }
        else if (Xa==Xd && Xb==Xc) {   
                if (Ya==Yd && Yb==Yc) 
                   System.out.println("Os Ret�ngulos se sobrep�em.");
        }
        else {
            System.out.println("Os ret�ngulos n�o se sobrep�em");
        }

}
	
}
