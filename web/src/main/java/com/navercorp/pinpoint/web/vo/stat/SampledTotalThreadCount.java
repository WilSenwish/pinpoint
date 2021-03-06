/*
 * Copyright 2020 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.web.vo.stat;

import com.navercorp.pinpoint.web.vo.chart.Point;
import com.navercorp.pinpoint.web.vo.chart.UncollectedPointCreatorFactory;
import com.navercorp.pinpoint.web.vo.stat.chart.agent.AgentStatPoint;

import java.util.Objects;

public class SampledTotalThreadCount implements SampledAgentStatDataPoint {
    public static final Long UNCOLLECTED_VALUE = -1L;
    public static final Point.UncollectedPointCreator<AgentStatPoint<Long>> UNCOLLECTED_POINT_CREATOR = UncollectedPointCreatorFactory.createLongPointCreator(UNCOLLECTED_VALUE);

    private final AgentStatPoint<Long> totalThreadCount;

    public SampledTotalThreadCount(AgentStatPoint<Long> totalThreadCount) {
        this.totalThreadCount = Objects.requireNonNull(totalThreadCount, "totalThreadCount");
    }

    public AgentStatPoint<Long> getTotalThreadCount() { return totalThreadCount; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SampledTotalThreadCount {");
        sb.append("totalThreadCount=").append(totalThreadCount);
        sb.append('}');
        return sb.toString();
    }
}
