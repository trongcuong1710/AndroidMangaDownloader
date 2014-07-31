package com.android.core;

/**
 * Created by DFS on 7/31/2014.
 */
public interface IUpdater
{
    /**
     * update manga list and save to xml file
     * @param url : site url
     * @param fileName : file name to be saved
     */
    void Update(String url, String fileName);
}
