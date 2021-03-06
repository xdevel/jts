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

package ru.jts.data.holder.npcpos;

import ru.jts.annotations.data.array.ObjectArray;
import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;
import ru.jts.data.common.Point4;

/**
 * @author : Camelion
 * @date : 30.08.12  20:12
 */
public class Domain {
    @StringValue(withoutName = true)
    public String name;
    @IntValue
    public int domain_id;
    @ObjectArray(withoutName = true)
    public Point4[] territory;
}
