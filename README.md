# MRE for bug [b/264764037](https://issuetracker.google.com/issues/264764037)

Opening keyboard when displaying dialog that has its size set to `match_parent` causes it to shift too much up, resulting in empty space between dialog and keyboard for a few frames. After that everything moves into expected positions.

Overriding dialog's theme and setting `windowIsFloating` to `false` or `windowSoftInputMode` to `adjustResize` fixes the issue.

![Bug state](https://github.com/RSBat/dialog-keyboard-bug/raw/main/bug.png)
![Final state](https://github.com/RSBat/dialog-keyboard-bug/raw/main/final_state.png)