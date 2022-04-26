# Git Cheat Sheet

## Set Push default.

Set the remote branch name to the current local branch name.
```bash
git config --local push.default current
```

## Set Pull reconciliation defaults.

Set the pull default to merge-strategy with fast-forward only.
```bash
git config --local pull.rebase false
git config --local pull.ff only
```

Unset reconciliation(s)
```bash
git config --local --unset pull.rebase
git config --local --unset pull.ff
```

## Set anonymous e-mail address for commits.

Set the e-mail address and username.
```bash
git config --local user.name "Osmund Francis"
git config --local user.email "21172332+osmundf@users.noreply.github.com"
```

## Push new bare repository to GitHub.

```bash
git init .
git remote add -m master github git@<ssh-alias>:<root>/<repository>.git
git add license.txt
git commit -m "License 2022."
git branch -M master
git push github master -u
```

## Swapping branch names.

Swapping branches is achieved by overwriting a branch head.  The equivalent is to delete the branches and pushing the new commit id to as a new branch.  This may be considered a "rewriting history" and, as such, must be coordinated between team members to ensure that locally checked out branches do not push to a master branch (it also alleviates hours of unnecessary debugging).


## Removing HEAD reference.

```bash
git for-each-ref
git symbolic-ref -d refs/remotes/<remote>/HEAD
```