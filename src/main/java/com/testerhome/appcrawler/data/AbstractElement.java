package com.testerhome.appcrawler.data;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.testerhome.appcrawler.URIElement;

import java.awt.Point;

@JsonDeserialize(as = URIElement.class)
public abstract class AbstractElement {
    public abstract Point center();
    public abstract String getId();
    public abstract String getName();
    public abstract String getTag();
    public abstract String getText();
    public abstract String getInstance();
    //todo: adb driver need fix url with package/.activity
    public abstract String getUrl();
    public abstract String getXpath();
    public abstract String getAction();
    public abstract String getAncestor();
    public abstract String elementUri();
    public abstract void setId(String id);
    public abstract void setName(String name);
    public abstract void setTag(String tag);
    public abstract void setAction(String action);
    public abstract String getValid();
    public abstract int getX();
    public abstract int getY();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract String getDepth();
    public abstract String getSelected();
    public abstract String validName();
}