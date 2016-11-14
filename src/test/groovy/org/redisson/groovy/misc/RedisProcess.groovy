/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.redisson.groovy.misc;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
/**
*/
@CompileStatic
public class RedisProcess {
  private final def org.redisson.misc.RedisProcess delegate;
  public RedisProcess(Object delegate) {
    this.delegate = (org.redisson.misc.RedisProcess) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public String getRedisServerAddressAndPort() {
    def ret = delegate.getRedisServerAddressAndPort();
    return ret;
  }
  public String getRedisServerBindAddress() {
    def ret = delegate.getRedisServerBindAddress();
    return ret;
  }
  public int getRedisServerPort() {
    def ret = delegate.getRedisServerPort();
    return ret;
  }
  public String getRedisVersion() {
    def ret = delegate.getRedisVersion();
    return ret;
  }
  public int stop() {
    def ret = delegate.stop();
    return ret;
  }
}
