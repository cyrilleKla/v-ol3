package org.vaadin.gwtol3.client.format;


/**
 * Created by mjhosio on 07/07/14.
 */
public class WFSFormat extends FeatureFormat{

    protected WFSFormat() {
    }

    public static final native WFSFormat create()/*-{
        return new $wnd.ol.format.WFS();
    }-*/;

    public static final native WFSFormat create(WFSFormatOptions options)/*-{
        return new $wnd.ol.format.WFS(options);
    }-*/;

}
