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
  implementation("com.github.vlsi.gradle:jandex-plugin:${dependencyVersion("versionJandexPlugin")}")
}

gradlePlugin {
  plugins {
    create("jandex") {
      id = "org.projectnessie.buildsupport.jandex"
      displayName = "Jandex Helper"
      description =
        "Projectnessie helper plugin to apply the Jandex plugin with an externally configured version"
      implementationClass = "org.projectnessie.buildtools.jandex.JandexHelperPlugin"
    }
  }
}

pluginBundle {
  vcsUrl = "https://github.com/projectnessie/nessie/"
  website = "https://github.com/projectnessie/nessie/"
  description =
    "Projectnessie helper plugin to apply the Jandex plugin with an externally configured version"
  tags = setOf("projectnessie", "jandex")
}

kotlinDslPluginOptions { jvmTarget.set(JavaVersion.VERSION_11.toString()) }
