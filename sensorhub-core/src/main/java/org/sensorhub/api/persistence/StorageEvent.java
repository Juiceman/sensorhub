/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are copyright (C) 2010, Sensia Software LLC
 All Rights Reserved.

 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.api.persistence;

import org.sensorhub.api.common.Event;


/**
 * <p><b>Title:</b>
 * StorageEvent
 * </p>
 *
 * <p><b>Description:</b><br/>
 * Base class for events generated by storage modules
 * </p>
 *
 * <p>Copyright (c) 2010</p>
 * @author Alexandre Robin
 * @date Nov 12, 2010
 */
public class StorageEvent extends Event
{
    private static final long serialVersionUID = 4070048416493934591L;

    
    /**
     * Possible event types for a StorageEvent
     */
    enum EventType
    {
        INSERT,
        UPDATE,
        RETRIEVE
    };
    
    
    /**
     * ID of storage that generated the event
     */
    protected String storageId;
    
    
    /**
     * Type of storage event
     */
    protected EventType type;
    
    
    /**
     * ID of retrieved, added or updated records
     */
    protected long[] recordIds;


    public String getStorageId()
    {
        return storageId;
    }


    public void setStorageId(String storageId)
    {
        this.storageId = storageId;
    }


    public EventType getType()
    {
        return type;
    }


    public void setType(EventType type)
    {
        this.type = type;
    }


    public long[] getRecordIds()
    {
        return recordIds;
    }


    public void setRecordIds(long[] recordIds)
    {
        this.recordIds = recordIds;
    }
}