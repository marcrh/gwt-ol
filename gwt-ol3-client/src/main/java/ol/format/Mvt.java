/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
/**
 *
 */
package ol.format;

import jsinterop.annotations.JsType;
import ol.Feature;
import ol.Options;
import ol.geom.Geometry;
import ol.proj.Projection;

import javax.annotation.Nullable;

/**
 * Feature format for reading data in the Mapbox MVT format.
 *
 * @author Tino Desjardins
 */
@JsType(isNative = true, name = "MVT")
public class Mvt extends ol.format.Feature {

    public Mvt() {}

    public Mvt(MvtOptions mvtOptions) {}

    /**
     * Read the projection from a MVT source.
     * 
     * @param source Document | Node | Object | string
     * @return {@link Geometry}
     */
    public native Projection readProjection(java.lang.Object source);

    public native Feature[] readFeatures(java.lang.Object source);

    /**
     * Read all features from a MVT source.
     * 
     * @param source Document | Node | Object | string
     * @param readOptions Read options.
     * @return [] {@link Feature}
     */
    public native Feature[] readFeatures(java.lang.Object source, @Nullable Options readOptions);

}
