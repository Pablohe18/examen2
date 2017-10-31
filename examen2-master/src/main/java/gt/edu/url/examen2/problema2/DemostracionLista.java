/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author Pablo Herrera
 */
public class DemostracionLista implements DemoList {
/**
 * Se agregan los datos en la Lista utilizando un objeto
 * @return 
 */
    @Override
    public List<Integer> crearDemoLista() {
        ArrayList List = new ArrayList();
        List.add(0,4);
        List.add(0, 3);
        List.add(0, 2);
        List.add(2, 1);
        List.add(1, 5);
        List.add(1, 6);
        List.add(3, 7);
        List.add(0, 8);
        return List;
        
    }
    
}
