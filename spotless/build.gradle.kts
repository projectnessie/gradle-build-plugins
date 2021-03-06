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
  id("com.gradle.plugin-publish")
}

dependencies {
  implementation(
    "com.diffplug.spotless:spotless-plugin-gradle:${dependencyVersion("versionSpotlessPlugin")}"
  )
}

gradlePlugin {
  plugins {
    create("spotless") {
      id = "org.projectnessie.buildsupport.spotless"
      displayName = "Spotless Helper"
      description = "Apply projectnessie specific spotless configurations"
      implementationClass = "org.projectnessie.buildtools.spotless.SpotlessHelperPlugin"
    }
  }
}

pluginBundle {
  vcsUrl = "https://github.com/projectnessie/nessie/"
  website = "https://github.com/projectnessie/nessie/"
  description = "Apply projectnessie specific spotless configurations"
  tags = setOf("projectnessie", "spotless")
}

kotlinDslPluginOptions { jvmTarget.set(JavaVersion.VERSION_11.toString()) }
