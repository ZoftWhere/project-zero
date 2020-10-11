# Sublime Text (MacOS)

# Application Settings

```json5
{
	"color_scheme": "Packages/Color Scheme - Default/Monokai.sublime-color-scheme",
	"font_size": 12,
	"ignored_packages":
	[
		"Vintage"
	],
	"native_tabs": "disabled",
	"show_tab_close_buttons": false,
	"theme": "Adaptive.sublime-theme"
}
```

# Key Binding Settings

```json5
[
    { "keys": ["super+backspace"], "command": "run_macro_file", "args": {"file": "res://Packages/Default/Delete Line.sublime-macro"} },

    { "keys": ["super+t"], "command": "new_file" },
    { "keys": ["super+f20"], "command": "toggle_overwrite" },
    { "keys": ["alt+f20"], "command": "context_menu" },
    { "keys": ["super+shift+a"], "command": "show_overlay", "args": {"overlay": "command_palette"} },
    { "keys": ["super+equals"], "command": /*"increase_font_size"*/ "" },
    { "keys": ["super+plus"], "command": /*"increase_font_size"*/ "" },
    { "keys": ["super+minus"], "command": /*"decrease_font_size"*/ "" },

    { "keys": ["super+h"], "command": "show_panel", "args": {"panel": "replace", "reverse": false} },

    {}
]
```
