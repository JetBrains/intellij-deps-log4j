/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.log4j.pattern;

/**
 * Formats an date by delegating to DatePatternConverter.  The default
 * date pattern for a %d specifier in a file name is different than
 * the %d pattern in pattern layout.
 *
 * @author Curt Arnold
 * @since 1.3
 */
public final class FileDatePatternConverter {
  /**
   * Private constructor.
   */
  private FileDatePatternConverter() {
  }

  /**
   * Obtains an instance of pattern converter.
   * @param options options, may be null.
   * @return instance of pattern converter.
   */
  public static PatternConverter newInstance(
    final String[] options) {
    if ((options == null) || (options.length == 0)) {
      return DatePatternConverter.newInstance(
        new String[] {
                "yyyy-MM-dd"
        });
    }

    return DatePatternConverter.newInstance(options);
  }
}