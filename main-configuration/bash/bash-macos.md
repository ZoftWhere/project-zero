# Bash Settings (macOS)

## User profile.

The user profile is stored in the file `.bash_profile`.

```text
open ~/.bash_profile
```

## Useful command prompt.

A useful command prompt has the dollar sign on a new line.
```text
osmund@ZoftWhere: ~
$
```

This can be achieved by add the following line to `~/.bash_profile`:
```bash
export PS1="\[\033[00;33m\]\u@\h\[\033[00m\]: \[\033[00;36m\]\w\[\033[00m\]\n$ "
```
