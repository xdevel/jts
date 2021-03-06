/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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

package ru.jts.loginserver.network.game_server;

import ru.jts.common.network.DefaultNetworkCrypt;
import ru.jts.common.network.IClientFactory;
import ru.jts.common.network.NetworkClient;

/**
 * @author : Camelion
 * @date : 17.08.12  19:43
 */
public class GameserverClientFactory implements IClientFactory {
    @Override
    public NetworkClient createNewClient() {
        return new GameserverClient(new DefaultNetworkCrypt(), GameserverPacketHandler.getInstance());
    }
}
