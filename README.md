# simpledocker
java code example to deploy in docker


use below commands step wise for docker deplymeent

#building producer project using Dockerfile present inside this 
docker build -f Dockerfile -t helloproducer .
#checking images are there or not
docker images

#building consumer project using Dockerfile present inside this 
docker build -f Dockerfile -t  helloconsumer  .
#checking images are there or not
docker images
docker ps

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
