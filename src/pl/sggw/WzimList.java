package pl.sggw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class WzimList<T> implements java.util.List<T>
{
    private Object tablica[];
    private int size = 0;
    private static int capacity = 20;

    public WzimList()
    {
        tablica = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o)
    {
        for(int i=0; i<size; i++ )
        {
            if(tablica[i]==o)
                return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray()
    {
        return tablica;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t)
    {
        if(size==capacity)
            return false;
        //while()
        tablica[size]=t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o)
    {
        int index = -1;
        for(int i=0; i<size; i++ )
        {
            if(tablica[i]==o)
            {
                tablica[i]=null;
                index=i;
                break;
            }
        }

        if(index==0)
        {
            tablica[0]=null;
            size--;
            return true;
        }
        else if(index > 0)
        {
            Object[] copyArray = new Object[tablica.length];
            System.arraycopy(tablica, 0, copyArray, 0, index);
            System.arraycopy(tablica, index + 1, copyArray, index, tablica.length - index - 1);
            size--;
            //System.out.println(Arrays.toString(tablica)); tablica = copyarray
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear()
    {
        Arrays.fill(tablica, null);
        size=0;
    }

    @Override
    public T get(int index) {
        return (T)tablica[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element)
    {
        if(index < capacity)
            tablica[index]=element;
    }

    @Override
    public T remove(int index)
    {
        if((index < 0) || (index > capacity))
            throw new IndexOutOfBoundsException();

        if(index==0)
        {
            tablica[0]=null;
            size--;
            return (T)tablica[index];
        }
        else if(index > 0)
        {
            Object[] copyArray = new Object[tablica.length];
            System.arraycopy(tablica, 0, copyArray, 0, index);
            System.arraycopy(tablica, index + 1, copyArray, index, tablica.length - index - 1);
            //tablica=copyArray;
            //size--;
            return (T)copyArray[index];
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}