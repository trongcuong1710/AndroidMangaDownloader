package com.android.dao;

import com.android.listener.NotifyChanged;

/**
 * Created by DFS on 7/31/2014.
 */
public class Chapter extends NotifyChanged
{
    /**
     * chapter number
     */
    private int chapterNo;

    /**
     * get chapter number
     * @return
     */
    public int getChapterNo() {
        return chapterNo;
    }

    /**
     * set chapter number
     * raise property changed event when changed
     * @param chapterNo
     */
    public void setChapterNo(int chapterNo) {
        boolean isChanged = false;

        if (this.chapterNo != chapterNo)
            isChanged = true;

        this.chapterNo = chapterNo;

        if (isChanged)
            this.onPropertyChanged();
    }

    /**
     * chapter name
     */
    private String chapterName;

    /**
     * get chapter name
     * @return
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * set chapter name
     * raise property changed event when changed
     * @param chapterName
     */
    public void setChapterName(String chapterName) {
        boolean isChanged = false;

        if(!this.chapterName.equals(chapterName))
            isChanged = true;

        this.chapterName = chapterName;

        if(isChanged)
            this.onPropertyChanged();
    }

    /**
     * chapter url
     */
    private String chapterUrl;

    /**
     * get chapter url
     * @return
     */
    public String getChapterUrl() {
        return chapterUrl;
    }

    /**
     * set chapter url
     * raise property changed event when changed
     * @param chapterUrl
     */
    public void setChapterUrl(String chapterUrl) {
        boolean isChanged = false;

        if(!this.chapterUrl.equals(chapterUrl))
            isChanged = true;

        this.chapterUrl = chapterUrl;

        if(isChanged)
            this.onPropertyChanged();
    }
}
