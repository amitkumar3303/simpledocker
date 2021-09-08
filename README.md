# simpledocker
java code example to deploy in docker

-----------------------------installation starts here-------------------------------------------------------
Initial requirement:
1.Docker desktop:Use below link to install.
  https://hub.docker.com/editions/community/docker-ce-desktop-windows/

2.Verify the installation by opening a terminal window (Command prompt) and type the following command then hit enter.
-->docker version

3.Next run the following command to check if your system is able to download and run docker images from docker hub.
  -->docker run -rm -it hello-world
####################################################################################################

4. for kubectl use below link to install.
https://kubernetes.io/docs/tasks/tools/  
or
https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/#install-kubectl-binary-with-curl-on-windows 
or 
https://dl.k8s.io/release/v1.20.0/bin/windows/amd64/kubectl.exe)

a)for verification:
  open cmd/powershell and use below command:
   kubectl version --client

2.Second option :
a)open below link for installation of chocolatey that will help for further installation.
(You may have to run Powershell as administrator to perform the installation)
 https://chocolatey.org/install
 
######################################################################################

Now you ready to use below command.


you can sign up in docker hub








--------------------------------installation end her----------------------------------




use below commands step wise for docker deplymeent

#building producer project using Dockerfile present inside this 
->docker build -f Dockerfile -t helloproducer .
#checking images are there or not
->docker images

#building consumer project using Dockerfile present inside this 
->docker build -f Dockerfile -t  helloconsumer  .
#checking images are there or not
->docker images
->docker ps

#creating network bridge between producer and consumer
docker network create producernet

#running producer in network with instance name hellopr
#here we are exposing service to external port 6062 mentioned in docker file
docker run --network producernet --name hellopr -p 6062:6061 -d helloproducer

#running producer in network with instance name helloco
#here we are exposing service to external port 5052 mentioned in docker file
docker run --network producernet --name helloco -p 5052:5051 -d helloconsumer

#check docker images in network
docker network inspect producernet

# open chrome use
localhost:6062/producerHere
localhost:5052/callProducer
#done
