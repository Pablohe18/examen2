/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema5;

/**
 *Se crea una estructura dinamica
 * Con la cual se pueden ingresar datos sin preocuparse por un tamaño fijo
 * se hacen varias validaciones para que se pueda agregar el espacio necesario para seguir trabajando en el.
 * @author Pablo Herrera
 */
public class DynamicStack implements Stack{
    
    int stack[];
    int top;
    DynamicStack(int size)
    {
     stack = new int[size];
     top=-1;
     }
    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public void push(int e) {
        if(top==(stack.length-1))
        {
            System.out.println("Aumentando tamaño del stack");
            int temp[] = new int[stack.length*2];
            int i;
            for(i=0;i<stack.length;i++)
            {
                temp[i]=stack[i];
            }
            stack=temp;
            stack[++top]= e;
        }
        else
            stack[++top]= e;
    }

    @Override
    public Object top() {
        int showtop = stack.length -1;
        return stack[showtop];
    }

    @Override
    public Object pop() {
        if(top==-1)
        {
            System.out.println("El stack esta vacio");
            return 0;
        }
        else
            return (stack[top--]);
    }
    void show()
 {
  for(int i:stack)
  {
   System.out.println(i);
  }
 }
}
