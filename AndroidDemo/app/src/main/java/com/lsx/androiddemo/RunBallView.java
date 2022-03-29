package com.lsx.androiddemo;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;

import io.flutter.plugin.platform.PlatformView;

class RunBallView implements PlatformView {
   private final RunBall view;

   RunBallView(@NonNull Context context) {
        view = new RunBall(context);
    }

    @NonNull
    @Override
    public View getView() {
        return view;
    }


    @Override
    public void dispose() {
    }
}
