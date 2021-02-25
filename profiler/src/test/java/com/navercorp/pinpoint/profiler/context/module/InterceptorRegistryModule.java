/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.context.module;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import java.util.Objects;
import com.navercorp.pinpoint.profiler.interceptor.registry.InterceptorRegistryBinder;

/**
 * @author Woonduk Kang(emeroad)
 */
public class InterceptorRegistryModule extends AbstractModule {
    private final InterceptorRegistryBinder interceptorRegistryBinder;

    public static Module wrap(InterceptorRegistryBinder interceptorRegistryBinder) {
        return new InterceptorRegistryModule(interceptorRegistryBinder);
    }

    private InterceptorRegistryModule(InterceptorRegistryBinder interceptorRegistryBinder) {
        this.interceptorRegistryBinder = Objects.requireNonNull(interceptorRegistryBinder, "interceptorRegistryBinder");
    }

    @Override
    protected void configure() {
        bind(InterceptorRegistryBinder.class).toInstance(interceptorRegistryBinder);
    }
}
