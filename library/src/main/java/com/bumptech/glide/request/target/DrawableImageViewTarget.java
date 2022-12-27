package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/** A target for display {@link Drawable} objects in {@link ImageView}s. */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {

  public DrawableImageViewTarget(ImageView view) {
    super(view);
  }

  /**
   * @deprecated Use {@link #waitForLayout()} instead.
   */
  // Public API.
  @SuppressWarnings({"unused", "deprecation"})
  @Deprecated
  public DrawableImageViewTarget(ImageView view, boolean waitForLayout) {
    super(view, waitForLayout);
  }

  @Override
  protected void setResource(@Nullable Drawable resource) {
    view.setImageDrawable(resource);
    Log.i("TAG", "Line ==> debug glide, call BitmapImageViewTarget.setResource(), drawable = "
        + resource + ", bitmap = ");

    if(resource instanceof BitmapDrawable){
      BitmapDrawable drawable = (BitmapDrawable) resource;
      Bitmap bitmap = drawable.getBitmap();
      Log.i("TAG", "Line ==> debug glide, call BitmapImageViewTarget.setResource(), drawable = "
          + resource + ", bitmap = " + bitmap);
    }

  }
}
