/*
 * Copyright (C) 2022 Dremio
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

plugins {
  `kotlin-dsl`
  alias(libs.plugins.gradle.publish.plugin)
}

gradlePlugin {
  plugins {
    create("jacoco") {
      id = "org.projectnessie.buildsupport.jacoco"
      displayName = "Jacoco Helper"
      description = "Jacoco helper plugin for individual projects."
      implementationClass = "org.projectnessie.buildtools.jacoco.JacocoHelperPlugin"
      tags.addAll("projectnessie", "jacoco", "code-coverage")
    }
    create("jacoco-aggregator") {
      id = "org.projectnessie.buildsupport.jacoco-aggregator"
      displayName = "Jacoco Aggregator Helper"
      description = "Jacoco helper plugin for the aggregating project."
      implementationClass = "org.projectnessie.buildtools.jacoco.JacocoAggregatorHelperPlugin"
      tags.addAll("projectnessie", "jacoco", "code-coverage")
    }
  }
  vcsUrl.set("https://github.com/projectnessie/nessie/")
  website.set("https://github.com/projectnessie/nessie/")
}

kotlinDslPluginOptions { jvmTarget.set(JavaVersion.VERSION_11.toString()) }
