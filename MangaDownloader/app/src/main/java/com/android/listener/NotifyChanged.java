package com.android.listener;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

/**
 * base class for notify property changed
 * any type need to override this to implement notify property changed
 * Created by DFS on 8/7/2014.
 */
public abstract class NotifyChanged
{
    /**
     * list of listerner
     */
    protected ArrayList<INotifyPropertyChanged> notifyPropertyChangedListeners;

    /**
     * constructor
     */
    public NotifyChanged()
    {
        this.notifyPropertyChangedListeners = new ArrayList<INotifyPropertyChanged>();
    }

    /**
     * add listener for property changed event
     * @param listener
     */
    public void addPropertyChangedListener(INotifyPropertyChanged listener) throws IllegalArgumentException
    {
        if (listener == null)
        {
            throw new IllegalArgumentException("Listener can not be null.");
        }

        this.notifyPropertyChangedListeners.add(listener);
    }

    /**
     * remove listener from listener list
     * @param listener
     * @throws IllegalArgumentException
     */
    public void removePropertyChangedListener(INotifyPropertyChanged listener) throws  IllegalArgumentException
    {
        if (listener == null)
        {
            throw new IllegalArgumentException("Listener can not be null.");
        }

        this.notifyPropertyChangedListeners.remove(listener);
    }

    /**
     * invoke property changed on listeners
     */
    public void onPropertyChanged()
    {
        for (INotifyPropertyChanged listener : notifyPropertyChangedListeners)
        {
            listener.PropertyChanged(this);
        }
    }
}
