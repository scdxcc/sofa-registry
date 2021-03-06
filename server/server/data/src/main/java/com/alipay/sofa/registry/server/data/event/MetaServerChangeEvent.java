/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.registry.server.data.event;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author qian.lqlq
 * @version $Id: MetaServerChangeEvent.java, v 0.1 2018-03-13 15:31 qian.lqlq Exp $
 */
public class MetaServerChangeEvent {

    private Map<String, Set<String>> ipMap;

    /**
     * constructor
     * @param ipMap
     */
    public MetaServerChangeEvent(Map<String, Set<String>> ipMap) {
        this.ipMap = ipMap;
    }

    /**
     * Getter method for property <tt>ipMap</tt>.
     *
     * @return property value of ipMap
     */
    public Map<String, Set<String>> getIpMap() {
        return ipMap;
    }
}