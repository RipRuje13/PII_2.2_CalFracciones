/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calfracciones;

/**
 *
 * @author Noriega
 */
public class Fraccion {
    private int numerador;
    private int denominador;


   public Fraccion(){
       numerador=0;
       denominador=0;
    }
   
   public Fraccion(int numerador, int denominador){
       this.numerador=numerador;
       this.denominador=denominador;
   }
   
   public int getNumerador(){
       return numerador;
   }
   
   public int getDenominador(){
       return denominador;
   }
   
   public void setNumerador(int numerador){
       this.numerador=numerador;
   }
   
   public void setDenominador(int denominador){
       this.denominador=denominador;
   }
   
   public Fraccion suma(Fraccion frac){
       int r1,r2,r3,r4;
       if(denominador==frac.getNumerador()){
           r1 = numerador + frac.getNumerador();
           r2 = denominador;
       }else{
           r1 = numerador* frac.getDenominador();
           r2 = denominador * frac.getNumerador();
           r1 = r1 + r2;
           r2 = denominador * frac.getDenominador();
       }
       return new Fraccion(r1,r2); 
   }
   
   public Fraccion resta(Fraccion frac){
       int r1,r2,r3,r4;
       if(denominador==frac.getDenominador()){
           r1 = numerador - frac.getNumerador();
           r2 = denominador;
       }else{
           r1 = numerador* frac.getDenominador();
           r2 = denominador * frac.getNumerador();
           r1 = r1 - r2;
           r2 = denominador * frac.getDenominador();
       }
       return new Fraccion(r1,r2);
   }
   
   public Fraccion multi(Fraccion frac){
       int r1,r2;
       r1 = numerador * frac.getNumerador();
       r2 = denominador * frac.getDenominador();
       return new Fraccion(r1,r2);
   }
   
   public Fraccion div(Fraccion frac){
       int r1, r2;
       r1 = numerador * frac.getDenominador();
       r2 = denominador * frac.getNumerador();
       return new Fraccion(r1,r2);
   }
   
   public void simplificar(Fraccion f1, Fraccion f2, Fraccion f3, Fraccion f4){
       int res1, res2;
       Fraccion  Fraccion[]={f1,f2,f3,f4};
       for(int i = 0 ;i<4;i++){

            while(Fraccion[i].getNumerador() % 2 == 0 && Fraccion[i].getDenominador()%2 == 0){
                 res1 = Fraccion[i].getNumerador() / 2;
                 Fraccion[i].setNumerador(res1);
                 res2 = Fraccion[i].getDenominador() / 2;
                 Fraccion[i].setDenominador(res2);
            }
            while(Fraccion[i].getNumerador() % 3 == 0 && Fraccion[i].getDenominador() % 3 == 0){
                 res1 = Fraccion[i].getNumerador() / 3;
                 Fraccion[i].setNumerador(res1);
                 res2 = Fraccion[i].getDenominador() / 3;
                 Fraccion[i].setDenominador(res2);
            }
            while(Fraccion[i].getNumerador() % 5 == 0 && Fraccion[i].getDenominador() % 5 == 0){
                 res1 = Fraccion[i].getNumerador() / 5;
                 Fraccion[i].setNumerador(res1);
                 res2 = Fraccion[i].getDenominador() / 5;
                 Fraccion[i].setDenominador(res2);
            }
       }

   }
   
   public String toString(Fraccion f1, Fraccion f2, Fraccion f3, Fraccion f4){
       return "Suma: "+ f1.getNumerador()+"/"+f1.getDenominador()+" Resta: "+ f2.getNumerador()+"/"+f2.getDenominador()+
              " multiplicacion: "+ f3.getNumerador()+"/"+f3.getDenominador()+" division: "+ f4.getNumerador()+"/"+f4.getDenominador();
   }
}


