# Bash Application: Find

## Pipe find into grep.

```bash
find . -type f -iname "<what-to-find>" -print0 | xargs -0 grep -iL "<what-to-grep>"
```

find . -type d -iname "cache" -print0 | xargs -0 grep -iL ".*/cache"
