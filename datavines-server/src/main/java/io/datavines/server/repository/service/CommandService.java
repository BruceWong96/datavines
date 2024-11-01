/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.datavines.server.repository.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.datavines.server.repository.entity.Command;

import java.util.List;

public interface CommandService extends IService<Command> {

    long insert(Command command);

    int update(Command command);

    Command getById(long id);

    Command getStartCommand(int totalSlot, int currentSlot);

    int deleteById(long id);

    boolean deleteByJobExecutionId(Long jobExecutionId);

    List<Command> listKillCommandByExecuteHost(String executeHost);
}
