# iTerm2

## Manually mapping natural text editing:

You can map the keys you need manually:

* Open Preferences
* Click “Keys” tab
* Click the \[+\] icon

Move cursor one word left

* Keyboard shortcut: ⌥ + ←
* Action: Send Hex Code
* Code: 0x1b 0x62

Move cursor one word right

* Keyboard Combination: ⌥ + →
* Action: Send Hex Code
* Code: 0x1b 0x66

Move cursor to beginning of line

* Keyboard Combination: ⌘ + ←
* Action: Send Hex Code
* Code: 0x01

Move cursor to end of line

* Keyboard Combination: ⌘ + →
* Action: Send Hex Code
* Code: 0x05

Delete word

* Keyboard Combination: ⌥ + ←Delete
* Action: Send Hex Code
* Code: 0x1b 0x08

Delete line

* Keyboard Combination: ⌘ + ←Delete
* Action: Send Hex Code
* Code: 0x15

Undo

* Keyboard Combination: ⌘ + z
* Action: Send Hex Code
* Code: 0x1f

Don't forget to remove the previous bindings:

* Open the “Profiles” tab
* Click “Keys” sub-tab
* Remove the mappings for key combinations ⌥ + ← and ⌥ + →
