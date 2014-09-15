package com.android.listener;

import java.util.ArrayList;
import com.android.listener.NotifyChanged;

/**
 * Created by DFS on 8/7/2014.
 */
public class NotifyList<E extends NotifyChanged>  extends ArrayList<E>
{
    /**
     * list of listeners
     */
    protected ArrayList<IListChanged> notifyListChangedListeners;

    /**
     * property changed listener
     */
    protected INotifyPropertyChanged propertyChangedListener;

    /**
     * constructor
     */
    public NotifyList()
    {
        this.notifyListChangedListeners = new ArrayList<IListChanged>();

        this.propertyChangedListener = new INotifyPropertyChanged() {
            @Override
            public void PropertyChanged(com.android.listener.NotifyChanged obj) {
                int index = NotifyList.this.indexOf(obj);
                EnmListChangedType type = EnmListChangedType.MODIFIED;
                NotifyList.this.onListChanged(index, type);
            }
        };
    }

    /**
     * override function add
     * raised list changed event with index equal to list last index and type ADDED
     * @param obj
     * @return
     */
    @Override
    public boolean add(E obj)
    {
        boolean result = super.add(obj);

        obj.addPropertyChangedListener(this.propertyChangedListener);

        int index = this.size() - 1;
        EnmListChangedType type = EnmListChangedType.ADD;

        this.onListChanged(index, type);

        return result;
    }

    /**
     * remove an element
     * @param obj
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public boolean remove(Object obj) throws IllegalArgumentException
    {
        if (obj.getClass() != NotifyChanged.class)
        {
            throw new IllegalArgumentException("Type must be derived of NotifyChanged.");
        }

        ((NotifyChanged)obj).removePropertyChangedListener(this.propertyChangedListener);

        EnmListChangedType type = EnmListChangedType.REMOVE;
        int index = this.indexOf(obj);

        boolean result = super.remove(obj);

        this.onListChanged(index, type);

        return result;
    }

    /**
     * remove element by index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    @Override
    public E remove(int index) throws IndexOutOfBoundsException
    {
        NotifyChanged obj;

        try {
            obj = this.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }

        obj.removePropertyChangedListener(this.propertyChangedListener);

        EnmListChangedType type = EnmListChangedType.REMOVE;

        E result = super.remove(index);

        this.onListChanged(index, type);

        return result;
    }

    /**
     * notify listener when list item changed
     * @param index
     * @param type
     */
    protected void onListChanged(int index, EnmListChangedType type)
    {
        for (IListChanged listener : this.notifyListChangedListeners)
        {
            listener.ListChanged(index, type);
        }
    }
}
