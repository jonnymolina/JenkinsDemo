### Description
This is a simple Java project to demonstrate a Jenkins build job and pipeline.

### Jenkins Ant Build Set-Up
```
Properties: platforms.JDK_1.7.home=$JAVA_HOME
```

### Steps 
- Launch EC2 Instance
- Select Amazon Linux AMI
- Use t2.micro (free tier)
- Use 1 node (for now)
- 8 GB storage is fine
- Configure Security Group — All traffic, All, All, 0.0.0.0/0
- ssh into ec2 instance
- sudo yum update
- sudo yum install git
- sudo yum install java-devel
- ssh-keygen -t rsa -C "jonathanmolina225@gmail.com"
- Install Jenkins thru the downloads page on jenkins website using Red Hat Distributions
- sudo service jenkins start
- Manage Jenkins > Manage Plugins > Available Tab > Select GitHub Authentication plugin > Install without restart
- Create New Job > Freestyle project > Add GitHub url
- Manage Jenkins > Global Tool Configuration > Add JDK > /usr/lib/jvm/java/
- Manage Jenkins > Global Tool Configuration > Add Ant > 1.8.4
- Manage Jenkins > Configure System > GitHub > Advanced.. > Select “Specify another hook url for GitHub configuration” > Copy
- GitHub Repo > Settings > Webhooks > Add webhook > Push everything
- Configure job > Build when a change is pushed to GitHub
- > Build > Invoke Ant > Properties > platforms.JDK_1.7.home=$JAVA_HOME
- > Source Code Management > Git

