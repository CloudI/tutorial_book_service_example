//-*-Mode:java;coding:utf-8;tab-width:4;c-basic-offset:4;indent-tabs-mode:()-*-
// ex: set ft=java fenc=utf-8 sts=4 ts=4 sw=4 et:
package org.cloudi.examples.tutorial;

import java.util.List;
import java.util.LinkedList;

public class JSONItemListResponse extends JSONResponse
{
    private final long user_id;
    private final List<JSONItem> items;

    public static JSONItemListResponse success(final long user_id,
                                               final List<JSONItem> items)
    {
        return new JSONItemListResponse(true, null, user_id, items);
    }

    public static JSONItemListResponse failure(final String error,
                                               final long user_id)
    {
        final List<JSONItem> empty = new LinkedList<JSONItem>();
        return new JSONItemListResponse(false, error, user_id, empty);
    }

    private JSONItemListResponse(final boolean success,
                                 final String error,
                                 final long user_id,
                                 final List<JSONItem> items)
    {
        super(success, error);
        this.user_id = user_id;
        this.items = items;
    }

}
