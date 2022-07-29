# GitHub Web Site

## Use SSH key per account.

An SSH key can be specified per website account (including GitHub) by using an SSH config.


```ssh-config
# admin account
Host admin.github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa_admin_github
# test account
Host test.github.com
	HostName github.com
	User git
	IdentityFile ~/.ssh/id_rsa_test_github
```
