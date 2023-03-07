# Steps to create pipeline
1. install java (openjdk-8-jdk) and maven 
2. install jenkins
	* Open jenkins doc to get linux commands
	* https://www.jenkins.io/doc/book/installing/linux/
	* jenkins=2.346.3
3. Add port 8080 to vm
4. Locate secrets password
	* chmod og=rx secrets
	* r means read
	* x means execute
5. Login and add github plugin
6. Add environment variables
	* configure system -> environment
7. Create jenkins multibranch pipeline
	* credentials only required for private repositories
	* Add github url
	* Everything else default (assuming your repo is normal)
8. Add webhook to github
	* url:8080/github-webhook/
9. Configure project to add jenkins file
	* I would start something simple just to see if any pushes is detected by jenkins
10. Keep checking jenkins console log output to see if everything is working as intended
11. Configure sudo to add jenkins as admin
	* sudo visudo
	* jenkins ALL= NOPASSWD: ALL
12. ...
13. Profit?