/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.ipojo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * This annotation declares a component.
 * This annotation is mandatory to declares an iPOJO component.
 * @author <a href="mailto:dev@felix.apache.org">Felix Project Team</a>
 */
@Target(ElementType.TYPE)
public @interface Component {
    
    /**
     * Set if the component type is public.
     * Default: false
     */
    boolean factory() default false;
    
    /**
     * Set the component type name.
     * Default : implementation class name.
     */
    String name() default "";
    
    /**
     * Enable / Disable the architecture exposition.
     * Default : false
     */
    boolean architecture() default false;
    
    /**
     * Set if the component is immediate.
     * Default : false
     */
    boolean immediate() default false;
    
    /**
     * Set if the component must propagate received configuration to provided services.
     * default: false
     */
    boolean propagation() default false;
}
