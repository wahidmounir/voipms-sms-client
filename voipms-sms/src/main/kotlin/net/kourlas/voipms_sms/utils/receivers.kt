/*
 * VoIP.ms SMS
 * Copyright (C) 2017 Michael Kourlas
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

package net.kourlas.voipms_sms.utils

import android.app.Activity
import android.content.BroadcastReceiver

/**
 * Unregisters the specified broadcast receiver from the specified activity.
 * Ignores IllegalArgumentExceptions.
 *
 * @param activity The specified activity.
 * @param receiver The specified broadcast receiver.
 */
fun safeUnregisterReceiver(activity: Activity,
                           receiver: BroadcastReceiver) = try {
    activity.unregisterReceiver(receiver)
} catch (_: IllegalArgumentException) {
    // Do nothing.
}