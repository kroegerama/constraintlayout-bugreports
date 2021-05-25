## A sample app to highlight some bugs in the `ConstraintLayout` library `2.1.0-beta02`


## 1. `wrap_content` bug

**Description:** `wrap_content` is calculated a few px too small causing `TextViews` to break the text.

- [Layout file](app/src/main/res/layout/wrap_content_bug.xml)
- [Layout description](app/src/main/res/xml/wrap_content_bug.xml)

**Version `2.1.0-beta02`**

![](media/wrap-content-bug-2.1.0.png?raw=true)

**Version `2.0.4`**

![](media/wrap-content-bug-2.0.4.png?raw=true)

---

## 2. `OnSwipe` bug

**Description:** The drag handle moves faster than the cursor.

- [Layout file](app/src/main/res/layout/swipe_bug.xml)
- [Layout description](app/src/main/res/xml/swipe_bug.xml)

**Version `2.1.0-beta02`**

https://user-images.githubusercontent.com/1519044/119558089-48946080-bda1-11eb-80c2-d1bce129bfd5.mp4

**Version `2.0.4`**


https://user-images.githubusercontent.com/1519044/119558129-55b14f80-bda1-11eb-88af-bed77ef75670.mp4

---

## 3. `autoCompleteMode Spring` bug

**Description:** The spring animation does not stop, regardless of the `springStopThreshold` attribute.

**Version `2.1.0-beta02`**

- [Layout file](app/src/main/res/layout/spring_bug.xml)
- [Layout description](app/src/main/res/xml/spring_bug.xml)

https://user-images.githubusercontent.com/1519044/119558163-5cd85d80-bda1-11eb-8792-4baa08ce7824.mp4
