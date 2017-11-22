/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Laptop
 */
public class ImplLeakyStack<E> implements LeakyStack{
    
    CircularLinkedList<Object> Ani = new CircularLinkedList<>();
    int capacidad = 0;
    int size = 0;
    
    public void ImplLeakyStack (int max){
       capacidad = max; 
    }
    @Override
    public int size() {
        return size;        
        throw new UnsupportedOperationException("el tamaño es 0"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object saveHistory(Object e) {
        if (size == capacidad)
        {
            Ani.removeFirst();
            for (int i = 0; i < Ani.size(); i++) {
                Ani.first() = Ani.first();
            }
        }
        else
        {
                    Ani.addLast(e);
        }
        size++;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object actual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object undo() {
        if (size == 0)
        {
            throw new UnsupportedOperationException("No hay historial"); //To change body of generated methods, choose Tools | Templates.
        }
        else
        {
            
        }
    }
}
