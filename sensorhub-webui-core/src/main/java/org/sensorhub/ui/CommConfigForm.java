/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.ui;

import org.sensorhub.ui.data.MyBeanItem;
import com.vaadin.data.Property;
import com.vaadin.ui.Field;


public class CommConfigForm extends GenericConfigForm
{
    private static final long serialVersionUID = -5570947777524310604L;


    @Override
    public boolean canUpdateInstance()
    {
        return true;
    }
    
    
    @Override
    public void build(String title, MyBeanItem<? extends Object> beanItem)
    {
        super.build(title, beanItem);  
    }
    
    
    @Override
    protected void customizeField(String propId, Property<?> prop, Field<?> field)
    {
        super.customizeField(propId, prop, field);
        
        if (propId.endsWith(PROP_ID))
            field.setVisible(false);
        else if (propId.endsWith(PROP_NAME))
            field.setVisible(false);
    }
}
