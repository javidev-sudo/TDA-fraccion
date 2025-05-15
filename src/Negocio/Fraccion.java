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
    
    public int getNumera() // sin signo
    {
        return Math.abs(nume);
    }
    public int getDenomi()
    {
        return Math.abs(denom);
    }
    
    public char getSigno()
    {
       if(nume >= 0)
       {
           return '+';
       }
       else
       {
           return '-';
       }
    }
    
    // setters
    
    public void setNumera(int numerador) // solo cambia el numerador el signo lo mantiene
    {
       if(this.nume >= 0)
       {
           this.nume = numerador;
       }
       else
       {
           this.nume = -numerador;
       }
    }
    
    public void setDenomi(int denominador)
    {
       this.denom = denominador;
    }
    public void setSigno(char signo)
    {
       if(signo == '+')
       {
           this.nume = Math.abs(nume);
       }
       else
       {
           this.nume = -Math.abs(nume);
       }
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
           return (u);
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
        this.nume = (A.nume * B.getDenomi()) + (A.getDenomi() * B.nume);
        this.simplificar();
    }
    
    public void Resta(Fraccion A, Fraccion B)
    {
        this.denom = A.getDenomi() * B.getDenomi();
        this.nume = (A.nume * B.getDenomi()) + (A.getDenomi() * B.nume);
        this.simplificar();
    }
    
    public void Multiplicacion(Fraccion A, Fraccion B)
    {
        this.denom = A.getDenomi() * B.getDenomi();
        this.nume = A.nume * B.nume;
        this.simplificar(); 
    }
    
    public void Division(Fraccion A, Fraccion B)
    {
        nume = A.nume * B.denom;
        denom = A.denom * B.nume;
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
