# Bash Application: SSH keys.

## Creating SSH configuration.

Ensure ~/.ssh directory is created:

```bash
mkdir -p ~/.ssh
```

Create configuration file.

```bash
touch ~/.ssh/config
```

Generate a 4096 bit key.

```bash
ssh-keygen -b 4096 -C comment
```