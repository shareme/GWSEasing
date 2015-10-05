/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 * Modifications Copyright (C) 2015 Fred Grott(GrottWorkShop)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.shareme.gwseasing.library;

import com.github.shareme.gwseasing.library.back.BackEaseIn;
import com.github.shareme.gwseasing.library.back.BackEaseInOut;
import com.github.shareme.gwseasing.library.back.BackEaseOut;
import com.github.shareme.gwseasing.library.bounce.BounceEaseIn;
import com.github.shareme.gwseasing.library.bounce.BounceEaseInOut;
import com.github.shareme.gwseasing.library.bounce.BounceEaseOut;
import com.github.shareme.gwseasing.library.circ.CircEaseIn;
import com.github.shareme.gwseasing.library.circ.CircEaseInOut;
import com.github.shareme.gwseasing.library.circ.CircEaseOut;
import com.github.shareme.gwseasing.library.cubic.CubicEaseIn;
import com.github.shareme.gwseasing.library.cubic.CubicEaseInOut;
import com.github.shareme.gwseasing.library.cubic.CubicEaseOut;
import com.github.shareme.gwseasing.library.elastic.ElasticEaseIn;
import com.github.shareme.gwseasing.library.elastic.ElasticEaseInOut;
import com.github.shareme.gwseasing.library.elastic.ElasticEaseOut;
import com.github.shareme.gwseasing.library.expo.ExpoEaseIn;
import com.github.shareme.gwseasing.library.expo.ExpoEaseInOut;
import com.github.shareme.gwseasing.library.expo.ExpoEaseOut;
import com.github.shareme.gwseasing.library.linear.Linear;
import com.github.shareme.gwseasing.library.quad.QuadEaseIn;
import com.github.shareme.gwseasing.library.quad.QuadEaseInOut;
import com.github.shareme.gwseasing.library.quad.QuadEaseOut;
import com.github.shareme.gwseasing.library.quint.QuintEaseIn;
import com.github.shareme.gwseasing.library.quint.QuintEaseInOut;
import com.github.shareme.gwseasing.library.quint.QuintEaseOut;
import com.github.shareme.gwseasing.library.sine.SineEaseIn;
import com.github.shareme.gwseasing.library.sine.SineEaseInOut;
import com.github.shareme.gwseasing.library.sine.SineEaseOut;

/**
 * Skill enum
 * Created by fgrott on 8/26/2015.
 */
@SuppressWarnings("unused")
public enum  Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseInOut(ElasticEaseInOut.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    Skill(Class clazz) {
        easingMethod = clazz;
    }

    @SuppressWarnings("unchecked")
    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
