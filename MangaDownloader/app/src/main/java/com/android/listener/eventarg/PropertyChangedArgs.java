package com.android.listener.eventarg;

/**
 * Created by DFS on 8/4/2014.
 * argument for notify property changed event
 */
public class PropertyChangedArgs
{
    /**
     * property name
     */
    private String name;

    /**
     * property name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * constructor
     * @param name : property name
     */
    public PropertyChangedArgs(String name)
    {
        this.name = name;
    }
}
