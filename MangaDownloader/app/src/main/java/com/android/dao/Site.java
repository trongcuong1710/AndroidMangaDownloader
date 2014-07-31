package com.android.dao;

import com.android.core.IUpdater;

import java.util.*;

/**
 * Created by DFS on 7/31/2014.
 */
public class Site
{
    /**
     * site name
     */
    private String name;

    /**
     * site url
     */
    private String url;

    /**
     * manga list
     */
    private ArrayList<Manga> mangas;

    /**
     * site updater
     */
    private IUpdater Updater;

    /**
     * get site name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set site name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get site url
     */
    public String getUrl() {
        return url;
    }

    /**
     * set site url
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get manga list
     * @return
     */
    public ArrayList<Manga> getMangas() {
        return mangas;
    }

    /**
     * set manga list
     * @param mangas
     */
    public void setMangas(ArrayList<Manga> mangas) {
        this.mangas = mangas;
    }
}
