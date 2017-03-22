/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package me.j360.idgen.sjdbc.impl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class SystemEnvWorkerIdTest extends AbstractWorkerIdTest {
    
    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();
    
    @Before
    public void setup() {
        environmentVariables.set("SJDBC_SELF_ID_GENERATOR_WORKER_ID", "13");
        super.setup();
    }
    
    @Override
    protected long getWorkerId() {
        return 13L;
    }
}
