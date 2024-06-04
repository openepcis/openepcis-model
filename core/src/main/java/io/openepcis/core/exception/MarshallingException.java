/*
 * Copyright 2022-2024 benelog GmbH & Co. KG
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package io.openepcis.core.exception;

public class MarshallingException extends RuntimeException {

  public MarshallingException(Throwable t) {
    super(t);
  }

  public MarshallingException(String msg) {
    super(msg);
  }

  public MarshallingException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
