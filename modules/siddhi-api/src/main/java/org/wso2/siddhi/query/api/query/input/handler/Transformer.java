/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.siddhi.query.api.query.input.handler;

import org.wso2.siddhi.query.api.expression.Expression;
import org.wso2.siddhi.query.api.extension.Extension;

import java.io.Serializable;

public class Transformer implements Serializable {

    private String name;
    private TransformExtension extension;
    private Expression[] parameters;

    public Transformer(String name, TransformExtension extension, Expression[] parameters) {
        this.name = name;
        this.extension = extension;
        this.parameters = parameters;
    }

    public Transformer(String name, Expression[] parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public Transformer(String extensionName, String factionName, Expression[] parameters) {
        this.extension = new TransformExtension(extensionName,factionName);
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public Extension getExtension() {
        return extension;
    }

    public Expression[] getParameters() {
        return parameters;
    }


}
