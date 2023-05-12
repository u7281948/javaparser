/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2023 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser;

import com.github.javaparser.steps.ManipulationSteps;
import com.github.javaparser.steps.SharedSteps;
import org.jbehave.core.junit.JUnit4StoryRunner;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4StoryRunner.class)
public class ManipulationTest extends BasicJBehaveTest {

    @Override
    public InjectableStepsFactory stepsFactory() {
        Map<String, Object> state = new HashMap<>();

        return new InstanceStepsFactory(configuration(),
                new SharedSteps(state),
                new ManipulationSteps(state));
    }

    public ManipulationTest() {
        super("**/manipulation*.story");
    }
}
