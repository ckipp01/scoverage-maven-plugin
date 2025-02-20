/*
 * Copyright 2014-2022 Grzegorz Slowikowski (gslowikowski at gmail dot com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

package org.scoverage.plugin;

import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Checks if coverage minimum reached without forking {@code scoverage} life cycle.
 * <br>
 * <br>
 * Check is performed using available SCoverage data,
 * for example generated by {@link SCoverageCheckMojo} (or {@link SCoverageReportMojo})
 * earlier in the build (or in previous build if it was not cleaned afterwards).
 * <br>
 * 
 * @author <a href="mailto:gslowikowski@gmail.com">Grzegorz Slowikowski</a>
 * @since 1.0.0
 */
@Mojo( name = "check-only" )
@Execute( phase = LifecyclePhase.NONE )
public class SCoverageCheckOnlyMojo
    extends SCoverageCheckMojo
{
}