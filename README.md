## A sample app to highlight some bugs in the `ConstraintLayout` library `2.1.0-beta02`


### `wrap_content` bug

**Description:** `wrap_content` is calculated a few px too small causing `TextViews` to break the text.

- [Layout file](app/src/main/res/layout/wrap_content_bug.xml)
- [Layout description](app/src/main/res/xml/wrap_content_bug.xml)

**Version 2.1.0-beta02**

![](media/wrap-content-bug-2.1.0.png?raw=true)

**Version 2.0.4**

![](media/wrap-content-bug-2.0.4.png?raw=true)


### `OnSwipe` bug

**Description:** The drag handle moves faster than the cursor.

- [Layout file](app/src/main/res/layout/swipe_bug.xml)
- [Layout description](app/src/main/res/xml/swipe_bug.xml)

**Version 2.1.0-beta02**

![](media/swipe-bug-2.1.0.mp4?raw=true)

**Version 2.0.4**

![](media/swipe-bug-2.0.4.mp4?raw=true)


