package org.kontalk;

import android.view.View;

import androidx.test.espresso.matcher.ViewMatchers.Visibility;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;


public final class VisibleViewMatcher extends TypeSafeMatcher<View> {

    public VisibleViewMatcher() {
        super(View.class);
    }

    public static VisibleViewMatcher isVisible(){
        return new VisibleViewMatcher();
    }

    @Override
    protected boolean matchesSafely(View target) {
        return withEffectiveVisibility(Visibility.VISIBLE).matches(target) &&
                target.getWidth() >  0 && target.getHeight() > 0;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("view has effective visibility VISIBLE and has width and height greater than zero");
    }
}