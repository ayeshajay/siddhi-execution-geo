/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.extension.siddhi.execution.geo.api;

import io.siddhi.core.util.config.ConfigReader;
import org.wso2.extension.siddhi.execution.geo.internal.exception.GeoLocationResolverException;

/**
 * Interface for the GeoCoordinates based on the ip address.
 */
public interface GeoCoordinateResolver {

    /**
     * This method will provide the geo location information related to the given ip.
     *
     * @param ip ip address
     * @return geo coordinate information related to given ip address
     */
    public GeoCoordinate getGeoCoordinateInfo(String ip);

    /**
     * This method will be invoked after the initializing the extension. You can do any initial configuration here.
     *
     * @param configReader this hold the extensions configuration reader
     * @throws GeoLocationResolverException this will throws a GeoLocationResolverException.
     */
    public void init(ConfigReader configReader) throws GeoLocationResolverException;

}
