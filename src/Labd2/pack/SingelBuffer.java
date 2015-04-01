package Labd2.pack;

/**
 * Created by samuelort on 15-03-31.
 * Project name: Labb2
 */
public class SingelBuffer<E> {
    Object [] arr = (E[]) new Object [1];


    public SingelBuffer() {
        arr[0] = null;
    }
    public boolean put(E e){

        if(arr[0] == null){
            arr[0] = e;
            return true;
        }else
            return false;
    }

    public E get(){
        if(arr[0] == null){
            return null;
        }
        E ee = null;
        ee = (E) arr[0];
        arr[0] = null;
        return ee;
    }

}
