/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.api.persistence;

import org.sensorhub.api.common.Event;
import org.sensorhub.api.persistence.StorageEvent.Type;


/**
 * <p>
 * Base class for events generated by storage modules
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since Nov 12, 2010
 */
public class StorageEvent extends Event<Type>
{
    
    /**
     * Possible event types for a StorageEvent
     */
    public enum Type
    {
        STORE,
        UPDATE,
        DELETE,
        GET
    };
    
    
    String recordType;


    public StorageEvent(long timeStamp, IStorageModule<?> source, String recordType, Type type)
    {
        this.type = type;
        this.timeStamp = timeStamp;
        //this.producerID = source.getLocalID();
        //this.channelID = recordType;
        this.source = source;
        this.recordType = recordType;
    }


    @Override
    public Type getType()
    {
        return type;
    }
    
    
    @Override
    public IStorageModule<?> getSource()
    {
        return (IStorageModule<?>)this.source;
    }
    
    
    public String getRecordType()
    {
        return recordType;
    }
}
