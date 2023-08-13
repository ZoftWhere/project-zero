# Sublime Text Helpful Snippets

## Optimize Sublime Text project indexing.

Indexing of binary files can be excluded by defining which files are considered binary (or which file types should not
be indexed).

```json5
{
	"folders":
	[
		{
			"path": "~",
			"binary_file_patterns": [
				"*.class", "*.dds", "*.eot", "*.gif", "*.ico", "*.JPG","*.jpg", "*.jpeg", "*.pdf", "*.png", "*.swf", "*.tar", "*.tga", "*.ttf", "*.jar", "*.zip"
			],
			"file_exclude_patterns": [
				".bash_history"
			],
			"folder_exclude_patterns": [
				"_target"
			]
		}
	]
}
```