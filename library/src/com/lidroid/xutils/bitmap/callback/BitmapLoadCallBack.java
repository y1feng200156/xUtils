/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lidroid.xutils.bitmap.callback;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.lidroid.xutils.bitmap.BitmapDisplayConfig;

public interface BitmapLoadCallBack<T extends View> {

    /**
     * Call back when start loading.
     *
     * @param container
     * @param uri
     * @param config
     */
    void onLoadStarted(T container, String uri, BitmapDisplayConfig config);

    /**
     * Call back when bitmap has loaded.
     *
     * @param container
     * @param url
     * @param bitmap
     * @param config
     */
    void onLoadCompleted(T container, String url, Bitmap bitmap, BitmapDisplayConfig config, BitmapLoadFrom from);

    /**
     * Call back when bitmap failed to load.
     *
     * @param container
     * @param url
     * @param drawable
     */
    void onLoadFailed(T container, String url, Drawable drawable);

    void setBitmapSetter(BitmapSetter<T> bitmapSetter);

    BitmapSetter<T> getBitmapSetter();

}