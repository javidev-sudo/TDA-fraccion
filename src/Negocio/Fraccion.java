/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author javi24
 */
public class Fraccion {
    int nume;
    int denom;
    
    public Fraccion()
    {
       nume = 0;
       denom = 1;
    }
    
    public Fraccion(int nume, int denom, char signo) // (5,6,+)  (-5,6,-)
    {
        this.denom = Math.abs(denom);
        if(signo == '+')
        {
           this.nume = Math.abs(nume);
        }
        else
        {
           this.nume = -Math.abs(nume); 
        }
    }
    
    // getters estos me devuelven un resultado
    
    public int getNumera()
    {
        return nume;
    }
    public int getDenomi()
    {
        return Math.abs(denom);
    }
    
    public char getSigno()
    {
       char signo = (nume >= 0)? '+': '-';
       return signo;
    }
    
    // setters
    
    public void setNumera(int numerador)
    {
       nume = (nume>=0)? numerador: -numerador;
    }
    public void setDenomi(int denominador)
    {
       this.denom = denominador; 
    }
    public void setSigno(char signo)
    {
       this.nume = (signo == '+')? +Math.abs(nume): -Math.abs(nume);
    }
    
    // operaciones
    
    public int MCD()
    {
       int u = Math.abs(nume);
       int v = Math.abs(denom);
       if(v == 0)
       {
          return u; 
       }
       else
       {
           int z;
           while(v!=0)
           {
              z = u%v;
              u = v;
              v = z;
           }
           return u;
       }
    }
    public void simplificar()
    {
        int x = MCD();
        nume = nume/x;
        denom = denom/x;
    }
    
    public void Suma(Fraccion A, Fraccion B)
    {
        this.denom = A.getDenomi() * B.getDenomi();
        this.nume = (B.getDenomi() * A.getNumera()) + (A.getDenomi()*B.getNumera());
        this.simplificar(); 
    }
    
    public void Resta(Fraccion A, Fraccion B)
    {
        this.denom = A.getDenomi() * B.getDenomi();
        this.nume = (B.getDenomi() * A.getNumera()) - (A.getDenomi()*B.getNumera());
        this.simplificar(); 
    }
    
    public void Multiplicacion(Fraccion A, Fraccion B)
    {
        this.denom = A.getDenomi() * B.getDenomi();
        this.nume = A.getNumera() * B.getNumera();
        this.simplificar(); 
    }
    
    public void Division(Fraccion A, Fraccion B)
    {
        nume = A.getNumera() * B.getDenomi();
        denom = A.getDenomi() * B.getNumera();
        if(denom < 0)
        {
           nume = nume * -1;
           denom = Math.abs(denom);
        }
        this.simplificar(); 
    }
 

    @Override
    public String toString() {
        
        if(this.denom == 1)
        {
            return "" + nume + "\n";
        }
        else
        {
           return nume + "\n" + "-----" + "\n" + denom + "\n"; 
        }
        
    }
    
    
}
