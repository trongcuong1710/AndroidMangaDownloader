package com.android.listener.eventarg;

import com.android.listener.EnmListChangedType;

/**
 * Created by DFS on 8/4/2014.
 * event argument for list changed event
 */
public class ListChangedEventArgs
{
    /**
     * determine which action raise list changed event
     */
    private EnmListChangedType type;

    /**
     * determine which action raise list changed event
     * @return
     */
    public EnmListChangedType getType() {
        return type;
    }

    /**
     * determine index of item which raise the event
     */
    private int index;

    /**
     * determine index of item which raise the event
     * -1 represent deleted item
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     * constructor
     * @param type : action which raise list changed event
     * @param index : index of item which raise the event
     */
    public ListChangedEventArgs(EnmListChangedType type, int index)
    {
        this.type = type;
        this.index = index;
    }
}
