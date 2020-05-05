package org.kontalk;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.kontalk.IsEqualTrimmingAndIgnoringCase.equalToTrimmingAndIgnoringCase;
import static org.kontalk.VisibleViewMatcher.isVisible;

import android.os.SystemClock;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.CoordinatesProvider;
import android.support.test.espresso.action.GeneralLocation;
import android.support.test.espresso.action.GeneralSwipeAction;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Swipe;
import android.support.test.espresso.action.Tap;
import android.support.test.espresso.action.ViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ETGTestCaseForPR {

  @Rule
  public ActivityTestRule<org.kontalk.ui.ConversationsActivity> mActivityTestRule =
      new ActivityTestRule<>(org.kontalk.ui.ConversationsActivity.class);

  @Test
  public void myTestCase() {
    System.out.println("Starting run of ETGTestCaseForPR");
    ViewInteraction android_widget_EditText =
        onView(
            allOf(
                withId(R.id.phone_number),
                withTextOrHint(equalToTrimmingAndIgnoringCase("5555215554")),
                isVisible()));
    android_widget_EditText.perform(replaceText("469102526372253"));

    ViewInteraction android_widget_Spinner = onView(allOf(withId(R.id.phone_cc), isVisible()));
    android_widget_Spinner.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    onView(isRoot()).perform(pressKey(KeyEvent.KEYCODE_ENTER));

    ViewInteraction android_widget_EditText2 =
        onView(
            allOf(
                withId(R.id.name),
                withTextOrHint(equalToTrimmingAndIgnoringCase("Your name")),
                isVisible()));
    android_widget_EditText2.perform(replaceText("strongheadness"));

    ViewInteraction android_widget_EditText3 =
        onView(
            allOf(
                withId(R.id.phone_number),
                withTextOrHint(equalToTrimmingAndIgnoringCase("469102526372253")),
                isVisible()));
    android_widget_EditText3.perform(replaceText("214654685882821"));

    ViewInteraction android_widget_Button =
        onView(
            allOf(
                withId(R.id.button_validate),
                withTextOrHint(equalToTrimmingAndIgnoringCase("REGISTER")),
                isVisible()));
    android_widget_Button.perform(getClickAction());

    ViewInteraction android_widget_TextView =
        onView(
            allOf(
                withId(R.id.md_buttonDefaultNegative),
                withTextOrHint(equalToTrimmingAndIgnoringCase("CANCEL")),
                isVisible(),
                isDescendantOfA(withId(R.id.md_root))));
    android_widget_TextView.perform(getClickAction());

    ViewInteraction android_widget_TextView2 =
        onView(
            allOf(withId(R.id.menu_settings), isVisible(), isDescendantOfA(withId(R.id.toolbar))));
    android_widget_TextView2.perform(getClickAction());

    // ViewInteraction android_widget_LinearLayout =
    // onView(allOf(classOrSuperClassesName(is("android.widget.LinearLayout")), isVisible()));
    // android_widget_LinearLayout.perform(getClickAction());
    // ViewInteraction android_widget_LinearLayout2 =
    // onView(allOf(classOrSuperClassesName(is("android.widget.LinearLayout")), isVisible()));
    // android_widget_LinearLayout2.perform(getClickAction());
    // ViewInteraction android_widget_RadioButton = onView(allOf(withId(R.id.md_control),
    // isVisible(), isDescendantOfA(allOf(withId(R.id.md_contentRecyclerView),
    // isDescendantOfA(withId(R.id.md_contentListViewFrame))))));
    // android_widget_RadioButton.perform(getClickAction());
    ViewInteraction root = onView(isRoot());
    root.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction android_widget_ImageButton =
        onView(
            allOf(
                withContentDescription(equalToTrimmingAndIgnoringCase("Navigate up")),
                isVisible(),
                isDescendantOfA(withId(R.id.toolbar))));
    android_widget_ImageButton.perform(getClickAction());

    ViewInteraction android_widget_Button2 =
        onView(
            allOf(
                withId(R.id.button_validate),
                withTextOrHint(equalToTrimmingAndIgnoringCase("REGISTER")),
                isVisible()));
    android_widget_Button2.perform(getClickAction());

    ViewInteraction android_widget_TextView3 =
        onView(
            allOf(
                withId(R.id.md_buttonDefaultNegative),
                withTextOrHint(equalToTrimmingAndIgnoringCase("CANCEL")),
                isVisible(),
                isDescendantOfA(withId(R.id.md_root))));
    android_widget_TextView3.perform(getClickAction());

    ViewInteraction android_widget_Button3 =
        onView(
            allOf(
                withId(R.id.button_validate),
                withTextOrHint(equalToTrimmingAndIgnoringCase("REGISTER")),
                isVisible()));
    android_widget_Button3.perform(getClickAction());

    ViewInteraction android_widget_TextView4 =
        onView(
            allOf(
                withId(R.id.md_buttonDefaultPositive),
                withTextOrHint(equalToTrimmingAndIgnoringCase("OK")),
                isVisible(),
                isDescendantOfA(withId(R.id.md_root))));
    android_widget_TextView4.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_ImageView =
        onView(
            allOf(
                withContentDescription(equalToTrimmingAndIgnoringCase("More options")),
                isVisible(),
                isDescendantOfA(withId(R.id.toolbar))));
    android_widget_ImageView.perform(getClickAction());

    ViewInteraction android_widget_LinearLayout3 =
        onView(
            allOf(
                classOrSuperClassesName(is("android.widget.LinearLayout")),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.content),
                        hasDescendant(
                            allOf(
                                withId(R.id.title),
                                withTextOrHint(equalToTrimmingAndIgnoringCase("Import key"))))))));
    android_widget_LinearLayout3.perform(getClickAction());

    ViewInteraction android_widget_LinearLayout4 =
        onView(
            allOf(
                classOrSuperClassesName(is("android.widget.LinearLayout")),
                isVisible(),
                hasDescendant(
                    allOf(
                        withId(R.id.md_title),
                        withTextOrHint(equalToTrimmingAndIgnoringCase("Android")))),
                isDescendantOfA(
                    allOf(
                        withId(R.id.md_contentRecyclerView),
                        isDescendantOfA(withId(R.id.md_contentListViewFrame))))));
    android_widget_LinearLayout4.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_EditText4 =
        onView(
            allOf(
                withId(R.id.name),
                withTextOrHint(equalToTrimmingAndIgnoringCase("strongheadness")),
                isVisible()));
    android_widget_EditText4.perform(replaceText("Moberg"));

    ViewInteraction android_widget_Spinner2 = onView(allOf(withId(R.id.phone_cc), isVisible()));
    android_widget_Spinner2.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction root2 = onView(isRoot());
    root2.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction root3 = onView(isRoot());
    root3.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    ViewInteraction root4 = onView(isRoot());
    root4.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    ViewInteraction root5 = onView(isRoot());
    root5.perform(getSwipeAction(540, 897, 540, 0));

    waitToScrollEnd();

    onView(isRoot()).perform(pressKey(KeyEvent.KEYCODE_ENTER));

    onView(isRoot()).perform(pressKey(KeyEvent.KEYCODE_ENTER));

    Espresso.pressBackUnconditionally();

    ViewInteraction android_widget_Spinner3 = onView(allOf(withId(R.id.phone_cc), isVisible()));
    android_widget_Spinner3.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    onView(isRoot()).perform(pressKey(KeyEvent.KEYCODE_ENTER));

    ViewInteraction root6 = onView(isRoot());
    root6.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction root7 = onView(isRoot());
    root7.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction android_widget_ImageView2 =
        onView(
            allOf(
                withContentDescription(equalToTrimmingAndIgnoringCase("More options")),
                isVisible(),
                isDescendantOfA(withId(R.id.toolbar))));
    android_widget_ImageView2.perform(getLongClickAction());

    ViewInteraction android_widget_Spinner4 = onView(allOf(withId(R.id.phone_cc), isVisible()));
    android_widget_Spinner4.perform(getClickAction());

    Espresso.pressBackUnconditionally();

    ViewInteraction root8 = onView(isRoot());
    root8.perform(getSwipeAction(540, 897, 540, 1794));

    waitToScrollEnd();

    ViewInteraction android_widget_ImageView3 =
        onView(
            allOf(
                withContentDescription(equalToTrimmingAndIgnoringCase("More options")),
                isVisible(),
                isDescendantOfA(withId(R.id.toolbar))));
    android_widget_ImageView3.perform(getLongClickAction());

    Espresso.pressBackUnconditionally();
  }

  private static Matcher<View> classOrSuperClassesName(final Matcher<String> classNameMatcher) {

    return new TypeSafeMatcher<View>() {
      @Override
      public void describeTo(Description description) {
        description.appendText("Class name or any super class name ");
        classNameMatcher.describeTo(description);
      }

      @Override
      public boolean matchesSafely(View view) {
        Class<?> clazz = view.getClass();
        String canonicalName;

        do {
          canonicalName = clazz.getCanonicalName();
          if (canonicalName == null) {
            return false;
          }

          if (classNameMatcher.matches(canonicalName)) {
            return true;
          }

          clazz = clazz.getSuperclass();
          if (clazz == null) {
            return false;
          }
        } while (!"java.lang.Object".equals(canonicalName));

        return false;
      }
    };
  }

  private static Matcher<View> withTextOrHint(final Matcher<String> stringMatcher) {
    return anyOf(withText(stringMatcher), withHint(stringMatcher));
  }

  private ViewAction getSwipeAction(
      final int fromX, final int fromY, final int toX, final int toY) {
    return ViewActions.actionWithAssertions(
        new GeneralSwipeAction(
            Swipe.SLOW,
            new CoordinatesProvider() {
              @Override
              public float[] calculateCoordinates(View view) {
                float[] coordinates = {fromX, fromY};
                return coordinates;
              }
            },
            new CoordinatesProvider() {
              @Override
              public float[] calculateCoordinates(View view) {
                float[] coordinates = {toX, toY};
                return coordinates;
              }
            },
            Press.FINGER));
  }

  private void waitToScrollEnd() {
    SystemClock.sleep(500);
  }

  private ClickWithoutDisplayConstraint getClickAction() {
    return new ClickWithoutDisplayConstraint(
        Tap.SINGLE,
        GeneralLocation.VISIBLE_CENTER,
        Press.FINGER,
        InputDevice.SOURCE_UNKNOWN,
        MotionEvent.BUTTON_PRIMARY);
  }

  private ClickWithoutDisplayConstraint getLongClickAction() {
    return new ClickWithoutDisplayConstraint(
        Tap.LONG,
        GeneralLocation.CENTER,
        Press.FINGER,
        InputDevice.SOURCE_UNKNOWN,
        MotionEvent.BUTTON_PRIMARY);
  }
}
