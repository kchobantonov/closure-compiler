/*
 * Copyright 2021 The Closure Compiler Authors.
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
package com.google.javascript.jscomp.serialization;

import com.google.protobuf.ByteString;

/** no-op j2cl replacement */
final class Wtf8Encoder {

  private Wtf8Encoder() {}

  static ByteString encodeToWtf8(String s) {
    throw new AssertionError("wtf-8 not supported in j2cl");
  }

  static String decodeFromWtf8(ByteString serialized) {
    throw new AssertionError("wtf-8 not supported in j2cl");
  }
}