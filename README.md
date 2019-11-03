# Web Service
### Development
For further reference, please consider the following sections:

- Bootstrapped via Spring Initialzr with REST Repositories dependencies imported
- Created Bean class of ServerDetails with Constructor / getters and setters
- Annotated AppController as RestController with a method of getServerDetails() which returns a new ServerDetails object with milliseconds as the server date time.
- built runnable jar file to be deployed in Cloud server.
- build jar via mvn clean install
- Set server port to listen as Port 5000.
### Deployment Web Service
- Free Tier AWS 
- Utilized EBS (Elastic Beanstalk) to upload code (Jar file) and launch EC2 instances
- Can be accessed via http://serverdetailsapi-env.dpcp87kjw5.us-east-2.elasticbeanstalk.com/getdetails
