# Microservice-architecture

Kubernetes manifests folder: `./kubernetes`
#### Homework
##### 1st hw
Url `http://arch.homework/otus/lapeevvd/` will be redirected to `http://arch.homework/`  

Url `http://arch.homework/otus/lapeevvd/health` will be redirected to `http://arch.homework/health`  
 
##### 2nd hw
To start application execute `helm install helm-chart .` in `./helm-chart` folder.

`./postman/homework-2.postman_collection.json` can be used for API test

---
###### Local startup
Use following environment variables:
```
DATABASE_URL=jdbc:postgresql://localhost:5432/microservice-architecture-db
DATABASE_PWD=postgres
DATABASE_USER=postgres
```
###### Docker build -> push to DockerHub
`mvn clean install`

`docker build -t lapeevvd/microservice-architecture .`

`docker push lapeevvd/microservice-architecture`